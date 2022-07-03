package com.sda.oop.exercices.enums;

public enum PackageSize {

    SMALL(1, 10),
    MEDIUM(11, 30),
    LARGE(31,70);

    private int minimalSize;
    private int maximalSize;

    PackageSize(int minimalSize, int maximalSize) {
        this.minimalSize = minimalSize;
        this.maximalSize = maximalSize;
    }

    public static PackageSize getPackedSize(int minimalSize, int maximalSize) {
        for(PackageSize packageSize : PackageSize.values()) {
            if (packageSize.minimalSize <= minimalSize && packageSize.maximalSize > maximalSize) {
                return packageSize;
            }
        }
        return null;
    }
}
