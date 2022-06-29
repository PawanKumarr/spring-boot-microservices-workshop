package org.pawan.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.pawan.user.entity.User;

@AllArgsConstructor
@Data
public class ResponseTemplate {
    private User user;
    private Department department;
}
