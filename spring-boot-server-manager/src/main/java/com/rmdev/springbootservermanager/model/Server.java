package com.rmdev.springbootservermanager.model;

import com.rmdev.springbootservermanager.enumeration.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    @NotEmpty(message = "IP Address can not be empty")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
