package com.example.library.service;

import com.example.library.dto.AdminDTO;
import com.example.library.model.Admin;

public interface AdminService {
    Admin findByUsername(String username);
    Admin save(AdminDTO adminDTO);
}
