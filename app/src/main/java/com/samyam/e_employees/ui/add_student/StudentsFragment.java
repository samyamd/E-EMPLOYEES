package com.samyam.e_employees.ui.add_student;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.samyam.e_employees.Interfaces.EmployeeAPI;
import com.samyam.e_employees.R;
import com.samyam.e_employees.model.CUDEmployee;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StudentsFragment extends Fragment {

    EditText name, age, salary;
    Button save;

    private static String url = "http://dummy.restapiexample.com/api/v1/";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_students, container, false);
        name = root.findViewById(R.id.etname);
        age = root.findViewById(R.id.etage);
        salary = root.findViewById(R.id.etSalary);


        save = root.findViewById(R.id.btnadd);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Button Clicked", Toast.LENGTH_SHORT).show();
                String ename = name.getText().toString();
                String esalary = salary.getText().toString();
                int eage = Integer.parseInt(age.getText().toString());

//                if (!TextUtils.isEmpty(name.getText().toString())) {
//                }
//                else{
//                    name.setError("Name is required.");
//                    return;
//                }
//                if (!TextUtils.isEmpty(salary.getText().toString())) {
//                }
//                else{
//                    salary.setError("Salary is required.");
//                    return;
//                }
//                if (!TextUtils.isEmpty((age.getText().toString()))) {
//                }
//                else{
//                    age.setError("Age is required.");
//                    return;
//                }

                CUDEmployee cudEmployee = new CUDEmployee(eage,ename,esalary);
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();

                EmployeeAPI employeeAPI = retrofit.create(EmployeeAPI.class);
                Call<Void> voidCall = employeeAPI.createEmp(cudEmployee);

                voidCall.enqueue(new Callback<Void>() {
                    @Override
                    public void onResponse(Call<Void> call, Response<Void> response) {
                        Toast.makeText(getActivity(), "Employee registered successfully", Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<Void> call, Throwable t) {
                        Toast.makeText(getActivity(), "Failed to register employee.", Toast.LENGTH_SHORT).show();
                    }
                });

//                name.setText("");
//                age.setText("");
//                salary.setText("");
//                Toast.makeText(getActivity(), "Data Successfully added", Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }
}