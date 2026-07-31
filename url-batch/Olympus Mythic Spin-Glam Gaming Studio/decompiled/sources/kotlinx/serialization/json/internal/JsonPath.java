package kotlinx.serialization.json.internal;

import com.ironsource.X3;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

/* compiled from: JsonPath.kt */
/* loaded from: classes9.dex */
public final class JsonPath {
    private int currentDepth;
    private Object[] currentObjectPath = new Object[8];
    private int[] indicies;

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    /* compiled from: JsonPath.kt */
    private static final class Tombstone {
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public final void pushDescriptor(SerialDescriptor sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i = this.currentDepth + 1;
        this.currentDepth = i;
        if (i == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[i] = sd;
    }

    public final void updateDescriptorIndex(int i) {
        this.indicies[this.currentDepth] = i;
    }

    public final void updateCurrentMapKey(Object obj) {
        int[] iArr = this.indicies;
        int i = this.currentDepth;
        if (iArr[i] != -2) {
            int i2 = i + 1;
            this.currentDepth = i2;
            if (i2 == this.currentObjectPath.length) {
                resize();
            }
        }
        Object[] objArr = this.currentObjectPath;
        int i3 = this.currentDepth;
        objArr[i3] = obj;
        this.indicies[i3] = -2;
    }

    public final void resetCurrentMapKey() {
        int[] iArr = this.indicies;
        int i = this.currentDepth;
        if (iArr[i] == -2) {
            this.currentObjectPath[i] = Tombstone.INSTANCE;
        }
    }

    public final void popDescriptor() {
        int i = this.currentDepth;
        int[] iArr = this.indicies;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            this.currentDepth = i - 1;
        }
        int i2 = this.currentDepth;
        if (i2 != -1) {
            this.currentDepth = i2 - 1;
        }
    }

    public final String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append("$");
        int i = this.currentDepth + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.currentObjectPath[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (Intrinsics.areEqual(serialDescriptor.getKind(), StructureKind.LIST.INSTANCE)) {
                    if (this.indicies[i2] != -1) {
                        sb.append(X3.j.d);
                        sb.append(this.indicies[i2]);
                        sb.append(X3.j.e);
                    }
                } else {
                    int i3 = this.indicies[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.getElementName(i3));
                    }
                }
            } else if (obj != Tombstone.INSTANCE) {
                sb.append(X3.j.d);
                sb.append("'");
                sb.append(obj);
                sb.append("'");
                sb.append(X3.j.e);
            }
        }
        return sb.toString();
    }

    private final void resize() {
        int i = this.currentDepth * 2;
        Object[] copyOf = Arrays.copyOf(this.currentObjectPath, i);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        this.currentObjectPath = copyOf;
        int[] copyOf2 = Arrays.copyOf(this.indicies, i);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        this.indicies = copyOf2;
    }

    public String toString() {
        return getPath();
    }
}
