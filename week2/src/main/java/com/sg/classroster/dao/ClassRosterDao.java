/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author Jtooleyful
 */
public interface ClassRosterDao {

    Student addStudent(String studentId, Student student)
            throws ClassRosterDaoException;

    List<Student> getAllStudents()
            throws ClassRosterDaoException;

    ;
    Student getStudent(String studentId)
            throws ClassRosterDaoException;

    ;
    Student removeStudent(String studentId)
            throws ClassRosterDaoException;
;
}
