package org.example;

import annotation.ValidationEmail;
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
    @Size(min = 12, max = 140, message = " Your need input min 12 max 140")
    private String name;
    @NotBlank(message = "Field Not null")
    private String descriptoin;
   @NotBlank(message = "Field Not null")
    private String urowen;
   @ValidationEmail(value = "abc", message = "Must startWiht abc")
    private String email;

}
