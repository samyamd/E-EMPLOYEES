package com.samyam.e_employees.Interfaces;

import com.samyam.e_employees.model.Employees;
import com.samyam.e_employees.model.CUDEmployee;
import com.samyam.e_employees.model.Employees;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface EmployeeAPI {

    //Retrieve all employee data
    @GET("employees")
    Call<List<Employees>> employeeData();


    // Search data by id
    @GET("employee/{empId}")
    Call<Employees> employeeById(@Path("empId") int empId);


    // CREATE NEW EMPLOYEE DATA
    @POST("create")
    Call<Void> createEmp(@Body CUDEmployee cudEmployee);

    //UPDATE EMPLOYEE DATA
    @PUT("update/{empId}")
    Call<Void> updateEmployee(@Path("empId") int empId, @Body CUDEmployee cudEmployee);

    //DELETE EMPLOYEE DATA
    @DELETE("delete/{empId}")
    Call<Void> deleteEmployee(@Path("empId") int empId);
}
