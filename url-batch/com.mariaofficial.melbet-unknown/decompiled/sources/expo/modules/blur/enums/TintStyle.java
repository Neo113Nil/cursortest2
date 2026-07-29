package expo.modules.blur.enums;

import androidx.core.view.ViewCompat;
import com.facebook.hermes.intl.Constants;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TintStyle.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006#"}, d2 = {"Lexpo/modules/blur/enums/TintStyle;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "EXTRA_LIGHT", "LIGHT", "DARK", "REGULAR", "PROMINENT", "SYSTEM_ULTRA_THIN_MATERIAL", "SYSTEM_THIN_MATERIAL", "SYSTEM_MATERIAL", "SYSTEM_THICK_MATERIAL", "SYSTEM_CHROME_MATERIAL", "SYSTEM_ULTRA_THIN_MATERIAL_LIGHT", "SYSTEM_THICK_MATERIAL_LIGHT", "SYSTEM_THIN_MATERIAL_LIGHT", "SYSTEM_MATERIAL_LIGHT", "SYSTEM_CHROME_MATERIAL_LIGHT", "SYSTEM_ULTRA_THIN_MATERIAL_DARK", "SYSTEM_THIN_MATERIAL_DARK", "SYSTEM_MATERIAL_DARK", "SYSTEM_THICK_MATERIAL_DARK", "SYSTEM_CHROME_MATERIAL_DARK", "toBlurEffect", "", "blurRadius", "", "toColorInt", "expo-blur_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TintStyle implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TintStyle[] $VALUES;
    private final String value;
    public static final TintStyle DEFAULT = new TintStyle("DEFAULT", 0, Constants.COLLATION_DEFAULT);
    public static final TintStyle EXTRA_LIGHT = new TintStyle("EXTRA_LIGHT", 1, "extraLight");
    public static final TintStyle LIGHT = new TintStyle("LIGHT", 2, "light");
    public static final TintStyle DARK = new TintStyle("DARK", 3, "dark");
    public static final TintStyle REGULAR = new TintStyle("REGULAR", 4, "regular");
    public static final TintStyle PROMINENT = new TintStyle("PROMINENT", 5, "prominent");
    public static final TintStyle SYSTEM_ULTRA_THIN_MATERIAL = new TintStyle("SYSTEM_ULTRA_THIN_MATERIAL", 6, "systemUltraThinMaterial");
    public static final TintStyle SYSTEM_THIN_MATERIAL = new TintStyle("SYSTEM_THIN_MATERIAL", 7, "systemThinMaterial");
    public static final TintStyle SYSTEM_MATERIAL = new TintStyle("SYSTEM_MATERIAL", 8, "systemMaterial");
    public static final TintStyle SYSTEM_THICK_MATERIAL = new TintStyle("SYSTEM_THICK_MATERIAL", 9, "systemThickMaterial");
    public static final TintStyle SYSTEM_CHROME_MATERIAL = new TintStyle("SYSTEM_CHROME_MATERIAL", 10, "systemChromeMaterial");
    public static final TintStyle SYSTEM_ULTRA_THIN_MATERIAL_LIGHT = new TintStyle("SYSTEM_ULTRA_THIN_MATERIAL_LIGHT", 11, "systemUltraThinMaterialLight");
    public static final TintStyle SYSTEM_THICK_MATERIAL_LIGHT = new TintStyle("SYSTEM_THICK_MATERIAL_LIGHT", 12, "systemThickMaterialLight");
    public static final TintStyle SYSTEM_THIN_MATERIAL_LIGHT = new TintStyle("SYSTEM_THIN_MATERIAL_LIGHT", 13, "systemThinMaterialLight");
    public static final TintStyle SYSTEM_MATERIAL_LIGHT = new TintStyle("SYSTEM_MATERIAL_LIGHT", 14, "systemMaterialLight");
    public static final TintStyle SYSTEM_CHROME_MATERIAL_LIGHT = new TintStyle("SYSTEM_CHROME_MATERIAL_LIGHT", 15, "systemChromeMaterialLight");
    public static final TintStyle SYSTEM_ULTRA_THIN_MATERIAL_DARK = new TintStyle("SYSTEM_ULTRA_THIN_MATERIAL_DARK", 16, "systemUltraThinMaterialDark");
    public static final TintStyle SYSTEM_THIN_MATERIAL_DARK = new TintStyle("SYSTEM_THIN_MATERIAL_DARK", 17, "systemThinMaterialDark");
    public static final TintStyle SYSTEM_MATERIAL_DARK = new TintStyle("SYSTEM_MATERIAL_DARK", 18, "systemMaterialDark");
    public static final TintStyle SYSTEM_THICK_MATERIAL_DARK = new TintStyle("SYSTEM_THICK_MATERIAL_DARK", 19, "systemThickMaterialDark");
    public static final TintStyle SYSTEM_CHROME_MATERIAL_DARK = new TintStyle("SYSTEM_CHROME_MATERIAL_DARK", 20, "systemChromeMaterialDark");

    /* compiled from: TintStyle.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TintStyle.values().length];
            try {
                iArr[TintStyle.EXTRA_LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TintStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TintStyle.SYSTEM_MATERIAL_LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TintStyle.SYSTEM_ULTRA_THIN_MATERIAL_LIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TintStyle.SYSTEM_THICK_MATERIAL_LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TintStyle.PROMINENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TintStyle.DEFAULT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TintStyle.SYSTEM_MATERIAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TintStyle.DARK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TintStyle.SYSTEM_MATERIAL_DARK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TintStyle.REGULAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TintStyle.SYSTEM_ULTRA_THIN_MATERIAL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TintStyle.SYSTEM_THICK_MATERIAL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TintStyle.SYSTEM_CHROME_MATERIAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TintStyle.SYSTEM_CHROME_MATERIAL_LIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[TintStyle.SYSTEM_THICK_MATERIAL_DARK.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[TintStyle.SYSTEM_THIN_MATERIAL_LIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[TintStyle.SYSTEM_THIN_MATERIAL_DARK.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[TintStyle.SYSTEM_ULTRA_THIN_MATERIAL_DARK.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[TintStyle.SYSTEM_CHROME_MATERIAL_DARK.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[TintStyle.SYSTEM_THIN_MATERIAL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ TintStyle[] $values() {
        return new TintStyle[]{DEFAULT, EXTRA_LIGHT, LIGHT, DARK, REGULAR, PROMINENT, SYSTEM_ULTRA_THIN_MATERIAL, SYSTEM_THIN_MATERIAL, SYSTEM_MATERIAL, SYSTEM_THICK_MATERIAL, SYSTEM_CHROME_MATERIAL, SYSTEM_ULTRA_THIN_MATERIAL_LIGHT, SYSTEM_THICK_MATERIAL_LIGHT, SYSTEM_THIN_MATERIAL_LIGHT, SYSTEM_MATERIAL_LIGHT, SYSTEM_CHROME_MATERIAL_LIGHT, SYSTEM_ULTRA_THIN_MATERIAL_DARK, SYSTEM_THIN_MATERIAL_DARK, SYSTEM_MATERIAL_DARK, SYSTEM_THICK_MATERIAL_DARK, SYSTEM_CHROME_MATERIAL_DARK};
    }

    public static EnumEntries<TintStyle> getEntries() {
        return $ENTRIES;
    }

    private TintStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        TintStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final int toBlurEffect(float blurRadius) {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return LIGHT.toColorInt(blurRadius);
            case 6:
            case 7:
            case 8:
                return DEFAULT.toColorInt(blurRadius);
            case 9:
            case 10:
                return DARK.toColorInt(blurRadius);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return toColorInt(blurRadius);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final int toColorInt(float blurRadius) {
        float f = blurRadius / 100;
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 2) {
            return (((int) ((255 * f) * 0.78d)) << 24) + 16382457;
        }
        if (i == 9) {
            return (((int) ((255 * f) * 0.69d)) << 24) + 1644825;
        }
        switch (i) {
            case 11:
                return (((int) ((255 * f) * 0.82d)) << 24) + 11776947;
            case 12:
                return (((int) ((255 * f) * 0.44d)) << 24) + 12566463;
            case 13:
                return (((int) ((255 * f) * 0.97d)) << 24) + 10066329;
            case 14:
                return (((int) ((255 * f) * 0.75d)) << 24) + ViewCompat.MEASURED_SIZE_MASK;
            case 15:
                return (((int) ((255 * f) * 0.97d)) << 24) + ViewCompat.MEASURED_SIZE_MASK;
            case 16:
                return (((int) ((255 * f) * 0.9d)) << 24) + 2434341;
            case 17:
                return (((int) ((255 * f) * 0.78d)) << 24) + 13092807;
            case 18:
                return (((int) ((255 * f) * 0.7d)) << 24) + 2434341;
            case 19:
                return (((int) ((255 * f) * 0.55d)) << 24) + 2434341;
            case 20:
                return ((int) ((255 * f) * 0.75d)) << 24;
            case 21:
                return (((int) ((255 * f) * 0.97d)) << 24) + 13092807;
            default:
                return (((int) ((255 * f) * 0.44d)) << 24) + ViewCompat.MEASURED_SIZE_MASK;
        }
    }

    public static TintStyle valueOf(String str) {
        return (TintStyle) Enum.valueOf(TintStyle.class, str);
    }

    public static TintStyle[] values() {
        return (TintStyle[]) $VALUES.clone();
    }
}
