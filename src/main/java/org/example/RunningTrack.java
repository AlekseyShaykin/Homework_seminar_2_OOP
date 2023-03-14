package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RunningTrack extends Obstruction{

    public int length;


    public int getLength() {
        return length;
    }
}
