package expo.modules.imagepicker;

import androidx.activity.result.contract.ActivityResultContracts;
import com.facebook.share.internal.ShareConstants;
import expo.modules.kotlin.types.Enumerable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImagePickerOptions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lexpo/modules/imagepicker/DefaultTab;", "Lexpo/modules/kotlin/types/Enumerable;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", ShareConstants.PHOTOS, "ALBUMS", "toDefaultTab", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$DefaultTab;", "expo-image-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultTab implements Enumerable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DefaultTab[] $VALUES;
    private final String value;
    public static final DefaultTab PHOTOS = new DefaultTab(ShareConstants.PHOTOS, 0, "photos");
    public static final DefaultTab ALBUMS = new DefaultTab("ALBUMS", 1, "albums");

    /* compiled from: ImagePickerOptions.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DefaultTab.values().length];
            try {
                iArr[DefaultTab.PHOTOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultTab.ALBUMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ DefaultTab[] $values() {
        return new DefaultTab[]{PHOTOS, ALBUMS};
    }

    public static EnumEntries<DefaultTab> getEntries() {
        return $ENTRIES;
    }

    private DefaultTab(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        DefaultTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final ActivityResultContracts.PickVisualMedia.DefaultTab toDefaultTab() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ActivityResultContracts.PickVisualMedia.DefaultTab.AlbumsTab.INSTANCE;
    }

    public static DefaultTab valueOf(String str) {
        return (DefaultTab) Enum.valueOf(DefaultTab.class, str);
    }

    public static DefaultTab[] values() {
        return (DefaultTab[]) $VALUES.clone();
    }
}
