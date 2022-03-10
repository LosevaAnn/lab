package com.company;
public class Point3d {
    private double xCoord;
    private double yCoord;
    private double zCoord;
    /**Конструктор инициализации**/
    public Point3d ( double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /**Конструктор по умолчанию**/
    public Point3d () {
        this(0, 0, 0);
    }
    /** Возвращение координаты Х**/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y**/
    public double getY () {
        return yCoord;
    }
    /** Возвращение координаты Z**/
    public double getZ () {
        return zCoord;
    }
    /**Установка значения координаты Х**/
    public void setX (double val) {
        xCoord = val;
    }
    /**Установка значения координаты Y**/
    public void setY (double val) {
        yCoord = val;
    }
    /**Установка значения координаты Z**/
    public void setZ (double val) {
        zCoord = val;
    }

    public boolean pointCompar ( Point3d P) {
        if (xCoord == P.getX() && yCoord == P.getY() && zCoord == P.getZ())
            return true;
        else
            return false;
    }

    public double distanceTo ( Point3d P ) {
        double S = Math.sqrt( Math.pow( (xCoord - P.getX()), 2 ) + Math.pow( (yCoord - P.getY()), 2 ) + Math.pow( (zCoord - P.getZ()), 2 ) );
        return (Math.round(S * 100.0) / 100.0);
    }

}
