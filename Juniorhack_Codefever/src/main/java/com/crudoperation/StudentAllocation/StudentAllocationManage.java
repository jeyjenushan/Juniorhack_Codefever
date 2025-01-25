package com.crudoperation.StudentAllocation;

import java.time.LocalDate;
import java.util.Date;
//axa
public class StudentAllocationManage {

    private String StudentId;
    private String HostelId;
    private int AllocationId;
    private LocalDate AllocationDate;

    public StudentAllocationManage(String studentId, String hostelId, int allocationId,LocalDate allocationDate) {
        StudentId = studentId;
        HostelId = hostelId;
        AllocationId = allocationId;
        AllocationDate = allocationDate;
    }

    public StudentAllocationManage() {
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String getHostelId() {
        return HostelId;
    }

    public void setHostelId(String hostelId) {
        HostelId = hostelId;
    }

    public int getAllocationId() {
        return AllocationId;
    }

    public void setAllocationId(int allocationId) {
        AllocationId = allocationId;
    }

    public LocalDate getAllocationDate() {
        return AllocationDate;
    }

    public void setAllocationDate(LocalDate allocationDate) {
        AllocationDate = allocationDate;
    }
}
