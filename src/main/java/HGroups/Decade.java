package HGroups;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Decade<A,B,C,D,E,F,G,H,I,J> {
    private A data;
    private B data2;
    private C data3;
    private D data4;
    private E data5;
    private F data6;
    private G data7;
    private H data8;
    private I data9;
    private J data10;


    public Decade(A data, B data2, C data3, D data4, E data5, F data6, G data7, H data8, I data9, J data10 ) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.data7 = data7;
        this.data8 = data8;
        this.data9 = data9;
        this.data10 = data10;
    }
    public void printGroup(){
        System.out.printf("%s, %s, %s, %s, %s, %s, %s, %s,%s, %s", data, data2,data3,data4, data5, data6, data7, data8, data9, data10);
    }

    public<X> Ennead get(X data) {
        if (data.equals(this.data))
            return  new Ennead(this.data2, this.data3, this.data4, this.data5, this.data6, this.data7, this.data8, this.data9, this.data10);
        else if (data.equals(this.data2))
            return new Ennead(this.data, this.data3, this.data4, this.data5, this.data6, this.data7, this.data8, this.data9, this.data10);
        else if (data.equals(this.data3))
            return new Ennead(this.data, this.data2, this.data4, this.data5, this.data6, this.data7, this.data8, this.data9, this.data10);
        else if (data.equals(this.data4))
            return new Ennead(this.data, this.data2, this.data3, this.data5, this.data6, this.data7, this.data8, this.data9, this.data10);
        else if (data.equals(this.data5))
            return new Ennead(this.data, this.data2, this.data3, this.data4, this.data6, this.data7, this.data8, this.data9, this.data10);
        else if (data.equals(this.data6))
            return new Ennead(this.data, this.data2, this.data3, this.data4, this.data5, this.data7, this.data8, this.data9, this.data10);
        else if (data.equals(this.data7))
            return new Ennead(this.data, this.data2, this.data3, this.data4, this.data5, this.data6, this.data8, this.data9, this.data10);
        else if (data.equals(this.data8))
            return new Ennead(this.data, this.data2, this.data3, this.data4, this.data5, this.data6, this.data7, this.data9, this.data10);
        else if (data.equals(this.data9))
            return new Ennead(this.data, this.data2, this.data3, this.data4, this.data5, this.data6, this.data7, this.data8, this.data10);
        else if (data.equals(this.data10))
            return new Ennead(this.data, this.data2, this.data3, this.data4, this.data5, this.data6, this.data7, this.data8, this.data9);
        else
            throw new NullPointerException("Invalid entry: "+data);
    }



    public<Y> void getInfo(Y query){
        Method[] methods = query.getClass().getMethods();
        Field[] fields = query.getClass().getFields();
        System.out.printf("%s \n Fields(Public):", query.getClass());
        for (Field field: fields) {
            System.out.printf(" %s,",field);
        }
        System.out.println();
        System.out.println("Methods(Public):");
        for (Method method: methods) {
            System.out.printf(" %s,",method);
        }
    }

}
