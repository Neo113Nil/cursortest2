package io.intercom.android.sdk.models;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import expo.modules.devlauncher.launcher.manifest.DevLauncherUserInterface;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Weight.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/intercom/android/sdk/models/Weight;", "", "<init>", "(Ljava/lang/String;I)V", "REGULAR", "LIGHT", "MEDIUM", "SEMI_BOLD", "BOLD", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Weight {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Weight[] $VALUES;

    @SerializedName("regular")
    public static final Weight REGULAR = new Weight("REGULAR", 0);

    @SerializedName(DevLauncherUserInterface.LIGHT)
    public static final Weight LIGHT = new Weight("LIGHT", 1);

    @SerializedName("medium")
    public static final Weight MEDIUM = new Weight("MEDIUM", 2);

    @SerializedName("semibold")
    public static final Weight SEMI_BOLD = new Weight("SEMI_BOLD", 3);

    @SerializedName(TtmlNode.BOLD)
    public static final Weight BOLD = new Weight("BOLD", 4);

    private static final /* synthetic */ Weight[] $values() {
        return new Weight[]{REGULAR, LIGHT, MEDIUM, SEMI_BOLD, BOLD};
    }

    public static EnumEntries<Weight> getEntries() {
        return $ENTRIES;
    }

    private Weight(String str, int i) {
    }

    static {
        Weight[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static Weight valueOf(String str) {
        return (Weight) Enum.valueOf(Weight.class, str);
    }

    public static Weight[] values() {
        return (Weight[]) $VALUES.clone();
    }
}
