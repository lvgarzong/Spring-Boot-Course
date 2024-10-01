/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.taskmanager.repository;

import com.example.taskmanager.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lvgarzon
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {}
