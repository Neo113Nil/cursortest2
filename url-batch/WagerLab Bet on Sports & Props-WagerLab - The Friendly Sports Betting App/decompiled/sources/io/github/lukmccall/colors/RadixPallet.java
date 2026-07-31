package io.github.lukmccall.colors;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.a.a.o.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.ably.lib.transport.Defaults;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RadixPallet.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0013B2\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\f0\u0011R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u0012H\u0086\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR,\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lio/github/lukmccall/colors/RadixPallet;", "T", "", "isDark", "", "colorConverter", "Lkotlin/Function1;", "Lio/github/lukmccall/colors/RawColor;", "Lkotlin/ParameterName;", "name", "color", "<init>", "(ZLkotlin/jvm/functions/Function1;)V", "()Z", "getColorConverter", "()Lkotlin/jvm/functions/Function1;", b.au, "Lio/github/lukmccall/colors/RadixPallet$SelectedColor;", "Lio/github/lukmccall/colors/RadixColor;", "SelectedColor", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RadixPallet<T> {
    private final Function1<RawColor, T> colorConverter;
    private final boolean isDark;

    /* JADX WARN: Multi-variable type inference failed */
    public RadixPallet(boolean z, Function1<? super RawColor, ? extends T> colorConverter) {
        Intrinsics.checkNotNullParameter(colorConverter, "colorConverter");
        this.isDark = z;
        this.colorConverter = colorConverter;
    }

    /* renamed from: isDark, reason: from getter */
    public final boolean getIsDark() {
        return this.isDark;
    }

    public final Function1<RawColor, T> getColorConverter() {
        return this.colorConverter;
    }

    /* compiled from: RadixPallet.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0004\u0018\u00002\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0086\u0002¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0006\u001a\u00100\u0007R\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u00100\u0007R\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u001f\u0010\r\u001a\u00100\u0007R\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\b8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u001f\u0010\u000f\u001a\u00100\u0007R\f0\u0000R\b\u0012\u0004\u0012\u00028\u00000\b8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0018\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u001d\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u001f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u001aR\u0011\u0010!\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001aR\u0011\u0010#\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010\u001aR\u0011\u0010%\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010\u001aR\u0011\u0010'\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010\u001aR\u0011\u0010)\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010+\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0011\u0010-\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010\u001aR\u0011\u0010/\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b0\u0010\u001a¨\u00062"}, d2 = {"Lio/github/lukmccall/colors/RadixPallet$SelectedColor;", "", "radixColor", "Lio/github/lukmccall/colors/RadixColor;", "<init>", "(Lio/github/lukmccall/colors/RadixPallet;Lio/github/lukmccall/colors/RadixColor;)V", "solid", "Lio/github/lukmccall/colors/RadixPallet$SelectedColor$SelectedColorVariant;", "Lio/github/lukmccall/colors/RadixPallet;", "getSolid", "()Lio/github/lukmccall/colors/RadixPallet$SelectedColor$SelectedColorVariant;", "alpha", "getAlpha", "p3", "getP3", "p3Alpha", "getP3Alpha", b.au, "scale", "Lio/github/lukmccall/colors/Scale;", "(Lio/github/lukmccall/colors/Scale;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "", "(I)Ljava/lang/Object;", "1", "get1", "()Ljava/lang/Object;", ExifInterface.GPS_MEASUREMENT_2D, "get2", ExifInterface.GPS_MEASUREMENT_3D, "get3", Defaults.ABLY_PROTOCOL_VERSION, "get4", "5", "get5", "6", "get6", "7", "get7", "8", "get8", "9", "get9", "10", "get10", "11", "get11", "12", "get12", "SelectedColorVariant", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SelectedColor {
        private final RadixColor radixColor;
        final /* synthetic */ RadixPallet<T> this$0;

        /* compiled from: RadixPallet.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH\u0086\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0086\u0002¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0012\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u001b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u001d\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u001f\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0011\u0010!\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0011\u0010#\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0011\u0010%\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0011\u0010'\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0011\u0010)\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u0006+"}, d2 = {"Lio/github/lukmccall/colors/RadixPallet$SelectedColor$SelectedColorVariant;", "", "dayNightColor", "Lio/github/lukmccall/colors/DayNightColor;", "<init>", "(Lio/github/lukmccall/colors/RadixPallet$SelectedColor;Lio/github/lukmccall/colors/DayNightColor;)V", "correctColors", "", "Lio/github/lukmccall/colors/RawColor;", "getCorrectColors", "()Ljava/util/List;", b.au, "scale", "Lio/github/lukmccall/colors/Scale;", "(Lio/github/lukmccall/colors/Scale;)Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "", "(I)Ljava/lang/Object;", "1", "get1", "()Ljava/lang/Object;", ExifInterface.GPS_MEASUREMENT_2D, "get2", ExifInterface.GPS_MEASUREMENT_3D, "get3", Defaults.ABLY_PROTOCOL_VERSION, "get4", "5", "get5", "6", "get6", "7", "get7", "8", "get8", "9", "get9", "10", "get10", "11", "get11", "12", "get12", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public final class SelectedColorVariant {
            private final DayNightColor dayNightColor;
            final /* synthetic */ RadixPallet<T>.SelectedColor this$0;

            public SelectedColorVariant(SelectedColor selectedColor, DayNightColor dayNightColor) {
                Intrinsics.checkNotNullParameter(dayNightColor, "dayNightColor");
                this.this$0 = selectedColor;
                this.dayNightColor = dayNightColor;
            }

            private final List<RawColor> getCorrectColors() {
                if (this.this$0.this$0.getIsDark()) {
                    return this.dayNightColor.getDark();
                }
                return this.dayNightColor.getLight();
            }

            public final T get(Scale scale) {
                Intrinsics.checkNotNullParameter(scale, "scale");
                return this.this$0.this$0.getColorConverter().invoke(getCorrectColors().get(scale.getValue()));
            }

            public final T get(int index) {
                return this.this$0.this$0.getColorConverter().invoke(getCorrectColors().get(index));
            }

            public final T get1() {
                return (T) get(Scale.f811);
            }

            public final T get2() {
                return (T) get(Scale.f852);
            }

            public final T get3() {
                return (T) get(Scale.f863);
            }

            public final T get4() {
                return (T) get(Scale.f874);
            }

            public final T get5() {
                return (T) get(Scale.f885);
            }

            public final T get6() {
                return (T) get(Scale.f896);
            }

            public final T get7() {
                return (T) get(Scale.f907);
            }

            public final T get8() {
                return (T) get(Scale.f918);
            }

            public final T get9() {
                return (T) get(Scale.f918);
            }

            public final T get10() {
                return (T) get(Scale.f8210);
            }

            public final T get11() {
                return (T) get(Scale.f8311);
            }

            public final T get12() {
                return (T) get(Scale.f8412);
            }
        }

        public SelectedColor(RadixPallet radixPallet, RadixColor radixColor) {
            Intrinsics.checkNotNullParameter(radixColor, "radixColor");
            this.this$0 = radixPallet;
            this.radixColor = radixColor;
        }

        public final RadixPallet<T>.SelectedColor.SelectedColorVariant getSolid() {
            return new SelectedColorVariant(this, this.radixColor.getSolid());
        }

        public final RadixPallet<T>.SelectedColor.SelectedColorVariant getAlpha() {
            return new SelectedColorVariant(this, this.radixColor.getAlpha());
        }

        public final RadixPallet<T>.SelectedColor.SelectedColorVariant getP3() {
            return new SelectedColorVariant(this, this.radixColor.getP3());
        }

        public final RadixPallet<T>.SelectedColor.SelectedColorVariant getP3Alpha() {
            return new SelectedColorVariant(this, this.radixColor.getP3Alpha());
        }

        public final T get(Scale scale) {
            Intrinsics.checkNotNullParameter(scale, "scale");
            return getSolid().get(scale);
        }

        public final T get(int index) {
            return getSolid().get(index);
        }

        public final T get1() {
            return (T) get(Scale.f811);
        }

        public final T get2() {
            return (T) get(Scale.f852);
        }

        public final T get3() {
            return (T) get(Scale.f863);
        }

        public final T get4() {
            return (T) get(Scale.f874);
        }

        public final T get5() {
            return (T) get(Scale.f885);
        }

        public final T get6() {
            return (T) get(Scale.f896);
        }

        public final T get7() {
            return (T) get(Scale.f907);
        }

        public final T get8() {
            return (T) get(Scale.f918);
        }

        public final T get9() {
            return (T) get(Scale.f918);
        }

        public final T get10() {
            return (T) get(Scale.f8210);
        }

        public final T get11() {
            return (T) get(Scale.f8311);
        }

        public final T get12() {
            return (T) get(Scale.f8412);
        }
    }

    public final RadixPallet<T>.SelectedColor get(RadixColor color) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new SelectedColor(this, color);
    }
}
