package o;

/* loaded from: classes.dex */
public enum YJ implements InterfaceC1854rt {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);

    public final int h;

    YJ(int i) {
        this.h = i;
    }

    public static YJ a(int i) {
        switch (i) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                return FLOAT;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                return DOUBLE;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // o.InterfaceC1854rt
    public final int getNumber() {
        return this.h;
    }
}
