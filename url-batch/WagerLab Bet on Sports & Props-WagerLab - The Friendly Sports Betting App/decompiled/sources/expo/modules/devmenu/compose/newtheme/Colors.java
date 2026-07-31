package expo.modules.devmenu.compose.newtheme;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Color;
import androidx.media3.exoplayer.offline.DownloadService;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.appstate.AppStateModule;
import io.github.lukmccall.colors.RadixPallet;
import io.github.lukmccall.colors.RadixPalletExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Colors.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0006\u001b\u001c\u001d\u001e\u001f B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00060\bR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u000b\u001a\u00060\fR\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u000f\u001a\u00060\u0010R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u00060\u0014R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0017\u001a\u00060\u0018R\u00020\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors;", "", "pallet", "Lio/github/lukmccall/colors/RadixPallet;", "Landroidx/compose/ui/graphics/Color;", "<init>", "(Lio/github/lukmccall/colors/RadixPallet;)V", "text", "Lexpo/modules/devmenu/compose/newtheme/Colors$Text;", "getText", "()Lexpo/modules/devmenu/compose/newtheme/Colors$Text;", AppStateModule.APP_STATE_BACKGROUND, "Lexpo/modules/devmenu/compose/newtheme/Colors$Background;", "getBackground", "()Lexpo/modules/devmenu/compose/newtheme/Colors$Background;", "icon", "Lexpo/modules/devmenu/compose/newtheme/Colors$Icon;", "getIcon", "()Lexpo/modules/devmenu/compose/newtheme/Colors$Icon;", OutlinedTextFieldKt.BorderId, "Lexpo/modules/devmenu/compose/newtheme/Colors$Border;", "getBorder", "()Lexpo/modules/devmenu/compose/newtheme/Colors$Border;", "buttons", "Lexpo/modules/devmenu/compose/newtheme/Colors$Buttons;", "getButtons", "()Lexpo/modules/devmenu/compose/newtheme/Colors$Buttons;", "Button", "Text", "Background", "Icon", "Border", "Buttons", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Colors {
    public static final int $stable = 8;
    private final Background background;
    private final Border border;
    private final Buttons buttons;
    private final Icon icon;
    private final RadixPallet<Color> pallet;
    private final Text text;

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u0019"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors$Button;", "", DownloadService.KEY_FOREGROUND, "Landroidx/compose/ui/graphics/Color;", AppStateModule.APP_STATE_BACKGROUND, "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getForeground-0d7_KjU", "()J", "J", "getBackground-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "copy", "copy--OWjLjI", "(JJ)Lexpo/modules/devmenu/compose/newtheme/Colors$Button;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;
        private final long background;
        private final long foreground;

        public /* synthetic */ Button(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2);
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ Button m10783copyOWjLjI$default(Button button, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = button.foreground;
            }
            if ((i & 2) != 0) {
                j2 = button.background;
            }
            return button.m10786copyOWjLjI(j, j2);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getForeground() {
            return this.foreground;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackground() {
            return this.background;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final Button m10786copyOWjLjI(long foreground, long background) {
            return new Button(foreground, background, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Color.m5658equalsimpl0(this.foreground, button.foreground) && Color.m5658equalsimpl0(this.background, button.background);
        }

        public int hashCode() {
            return (Color.m5664hashCodeimpl(this.foreground) * 31) + Color.m5664hashCodeimpl(this.background);
        }

        public String toString() {
            return "Button(foreground=" + Color.m5665toStringimpl(this.foreground) + ", background=" + Color.m5665toStringimpl(this.background) + ")";
        }

        private Button(long j, long j2) {
            this.foreground = j;
            this.background = j2;
        }

        /* renamed from: getForeground-0d7_KjU, reason: not valid java name */
        public final long m10788getForeground0d7_KjU() {
            return this.foreground;
        }

        /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
        public final long m10787getBackground0d7_KjU() {
            return this.background;
        }
    }

    public Colors(RadixPallet<Color> pallet) {
        Intrinsics.checkNotNullParameter(pallet, "pallet");
        this.pallet = pallet;
        this.text = new Text();
        this.background = new Background();
        this.icon = new Icon();
        this.border = new Border();
        this.buttons = new Buttons();
    }

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors$Text;", "", "<init>", "(Lexpo/modules/devmenu/compose/newtheme/Colors;)V", "default", "Landroidx/compose/ui/graphics/Color;", "getDefault-0d7_KjU", "()J", "J", "secondary", "getSecondary-0d7_KjU", "tertiary", "getTertiary-0d7_KjU", "quaternary", "getQuaternary-0d7_KjU", "link", "getLink-0d7_KjU", "warning", "getWarning-0d7_KjU", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Text {
        private final long default;
        private final long link;
        private final long quaternary;
        private final long secondary;
        private final long tertiary;
        private final long warning;

        public Text() {
            this.default = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get12()).m5667unboximpl();
            this.secondary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get11()).m5667unboximpl();
            this.tertiary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get10()).m5667unboximpl();
            this.quaternary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get9()).m5667unboximpl();
            this.link = ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get11()).m5667unboximpl();
            this.warning = ((Color) RadixPalletExtensionKt.getYellow(Colors.this.pallet).get11()).m5667unboximpl();
        }

        /* renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
        public final long getDefault() {
            return this.default;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: getQuaternary-0d7_KjU, reason: not valid java name and from getter */
        public final long getQuaternary() {
            return this.quaternary;
        }

        /* renamed from: getLink-0d7_KjU, reason: not valid java name and from getter */
        public final long getLink() {
            return this.link;
        }

        /* renamed from: getWarning-0d7_KjU, reason: not valid java name and from getter */
        public final long getWarning() {
            return this.warning;
        }
    }

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors$Background;", "", "<init>", "(Lexpo/modules/devmenu/compose/newtheme/Colors;)V", "default", "Landroidx/compose/ui/graphics/Color;", "getDefault-0d7_KjU", "()J", "J", "subtle", "getSubtle-0d7_KjU", "element", "getElement-0d7_KjU", "warning", "getWarning-0d7_KjU", "info", "getInfo-0d7_KjU", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Background {
        private final long default;
        private final long element;
        private final long info;
        private final long subtle;
        private final long warning;

        public Background() {
            long m5694getWhite0d7_KjU;
            if (Colors.this.pallet.getIsDark()) {
                m5694getWhite0d7_KjU = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get1()).m5667unboximpl();
            } else {
                m5694getWhite0d7_KjU = Color.INSTANCE.m5694getWhite0d7_KjU();
            }
            this.default = m5694getWhite0d7_KjU;
            this.subtle = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get2()).m5667unboximpl();
            this.element = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get3()).m5667unboximpl();
            this.warning = ((Color) RadixPalletExtensionKt.getYellow(Colors.this.pallet).get3()).m5667unboximpl();
            this.info = ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get3()).m5667unboximpl();
        }

        /* renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
        public final long getDefault() {
            return this.default;
        }

        /* renamed from: getSubtle-0d7_KjU, reason: not valid java name and from getter */
        public final long getSubtle() {
            return this.subtle;
        }

        /* renamed from: getElement-0d7_KjU, reason: not valid java name and from getter */
        public final long getElement() {
            return this.element;
        }

        /* renamed from: getWarning-0d7_KjU, reason: not valid java name and from getter */
        public final long getWarning() {
            return this.warning;
        }

        /* renamed from: getInfo-0d7_KjU, reason: not valid java name and from getter */
        public final long getInfo() {
            return this.info;
        }
    }

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0013\u0010\r\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0013\u0010\u000f\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0010\u0010\u0007R\u0013\u0010\u0011\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors$Icon;", "", "<init>", "(Lexpo/modules/devmenu/compose/newtheme/Colors;)V", "default", "Landroidx/compose/ui/graphics/Color;", "getDefault-0d7_KjU", "()J", "J", "secondary", "getSecondary-0d7_KjU", "tertiary", "getTertiary-0d7_KjU", "quaternary", "getQuaternary-0d7_KjU", "warning", "getWarning-0d7_KjU", "info", "getInfo-0d7_KjU", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Icon {
        private final long default;
        private final long info;
        private final long quaternary;
        private final long secondary;
        private final long tertiary;
        private final long warning;

        public Icon() {
            this.default = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get11()).m5667unboximpl();
            this.secondary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get10()).m5667unboximpl();
            this.tertiary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get9()).m5667unboximpl();
            this.quaternary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get8()).m5667unboximpl();
            this.warning = ((Color) RadixPalletExtensionKt.getYellow(Colors.this.pallet).get11()).m5667unboximpl();
            this.info = ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get10()).m5667unboximpl();
        }

        /* renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
        public final long getDefault() {
            return this.default;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: getQuaternary-0d7_KjU, reason: not valid java name and from getter */
        public final long getQuaternary() {
            return this.quaternary;
        }

        /* renamed from: getWarning-0d7_KjU, reason: not valid java name and from getter */
        public final long getWarning() {
            return this.warning;
        }

        /* renamed from: getInfo-0d7_KjU, reason: not valid java name and from getter */
        public final long getInfo() {
            return this.info;
        }
    }

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\u000b\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors$Border;", "", "<init>", "(Lexpo/modules/devmenu/compose/newtheme/Colors;)V", "default", "Landroidx/compose/ui/graphics/Color;", "getDefault-0d7_KjU", "()J", "J", "secondary", "getSecondary-0d7_KjU", "error", "getError-0d7_KjU", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Border {
        private final long default;
        private final long error;
        private final long secondary;

        public Border() {
            this.default = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get7()).m5667unboximpl();
            this.secondary = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get6()).m5667unboximpl();
            this.error = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get6()).m5667unboximpl();
        }

        /* renamed from: getDefault-0d7_KjU, reason: not valid java name and from getter */
        public final long getDefault() {
            return this.default;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: getError-0d7_KjU, reason: not valid java name and from getter */
        public final long getError() {
            return this.error;
        }
    }

    /* compiled from: Colors.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lexpo/modules/devmenu/compose/newtheme/Colors$Buttons;", "", "<init>", "(Lexpo/modules/devmenu/compose/newtheme/Colors;)V", "primary", "Lexpo/modules/devmenu/compose/newtheme/Colors$Button;", "getPrimary", "()Lexpo/modules/devmenu/compose/newtheme/Colors$Button;", "secondary", "getSecondary", "tertiary", "getTertiary", "expo-dev-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Buttons {
        private final Button primary;
        private final Button secondary;
        private final Button tertiary;

        public Buttons() {
            long m5667unboximpl;
            long m5694getWhite0d7_KjU;
            this.primary = new Button(Color.INSTANCE.m5694getWhite0d7_KjU(), Colors.this.pallet.getIsDark() ? ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get8()).m5667unboximpl() : ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get10()).m5667unboximpl(), null);
            if (!Colors.this.pallet.getIsDark()) {
                m5667unboximpl = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get12()).m5667unboximpl();
            } else {
                m5667unboximpl = Color.INSTANCE.m5694getWhite0d7_KjU();
            }
            if (Colors.this.pallet.getIsDark()) {
                m5694getWhite0d7_KjU = ((Color) RadixPalletExtensionKt.getGray(Colors.this.pallet).get3()).m5667unboximpl();
            } else {
                m5694getWhite0d7_KjU = Color.INSTANCE.m5694getWhite0d7_KjU();
            }
            this.secondary = new Button(m5667unboximpl, m5694getWhite0d7_KjU, null);
            this.tertiary = new Button(Colors.this.pallet.getIsDark() ? ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get11()).m5667unboximpl() : ((Color) RadixPalletExtensionKt.getBlue(Colors.this.pallet).get10()).m5667unboximpl(), Color.INSTANCE.m5692getTransparent0d7_KjU(), null);
        }

        public final Button getPrimary() {
            return this.primary;
        }

        public final Button getSecondary() {
            return this.secondary;
        }

        public final Button getTertiary() {
            return this.tertiary;
        }
    }

    public final Text getText() {
        return this.text;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Border getBorder() {
        return this.border;
    }

    public final Buttons getButtons() {
        return this.buttons;
    }
}
