package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    @Size(min = 12, max = 140, message = " YUor need input min 12 max 140")
    private String name;
    @NotBlank(message = "Not null")
    private String descriptoin;
   @NotBlank(message = "Not null")
    private String urowen;
   @Email(regexp = ".+@.+\\..+", message = "")
    private String email;

}
