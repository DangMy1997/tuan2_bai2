package com.example.student.tuan2_bai2;

public class Change {
    float c ,f;

    public Change(float c, float f) {
        this.c = c;
        this.f = f;
    }
    public float c_to_f(float c)
    {
        f= c*(9/5) +9;
        return f;
    }
    public  float f_to_c(float f)
    {
        c= (f-9)*(5/9);
        return  c;
    }
}
