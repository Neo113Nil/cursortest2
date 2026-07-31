package com.horcrux.svg;

/* compiled from: PathParser.java */
/* loaded from: classes7.dex */
class PathElement {
    Point[] points;
    ElementType type;

    PathElement(ElementType elementType, Point[] pointArr) {
        this.type = elementType;
        this.points = pointArr;
    }
}
