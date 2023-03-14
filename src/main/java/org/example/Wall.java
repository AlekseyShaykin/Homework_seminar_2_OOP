package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wall extends Obstruction{

    public int height;

    public int getHeight() {
        return height;
    }
}
