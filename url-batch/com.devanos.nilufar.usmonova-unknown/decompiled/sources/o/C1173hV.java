package o;

import org.json.JSONObject;

/* renamed from: o.hV, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173hV {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public C1173hV(String str, int i, int i2, int i3, int i4) {
        if (!(i == -1 && i2 == -1) && (i < 0 || i2 < 0)) {
            throw new IndexOutOfBoundsException("invalid selection: (" + i + ", " + i2 + ")");
        }
        if (!(i3 == -1 && i4 == -1) && (i3 < 0 || i3 > i4)) {
            throw new IndexOutOfBoundsException("invalid composing range: (" + i3 + ", " + i4 + ")");
        }
        if (i4 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC2188wx.g(i3, "invalid composing start: "));
        }
        if (i > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC2188wx.g(i, "invalid selection start: "));
        }
        if (i2 > str.length()) {
            throw new IndexOutOfBoundsException(AbstractC2188wx.g(i2, "invalid selection end: "));
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static C1173hV a(JSONObject jSONObject) {
        return new C1173hV(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
    }
}
