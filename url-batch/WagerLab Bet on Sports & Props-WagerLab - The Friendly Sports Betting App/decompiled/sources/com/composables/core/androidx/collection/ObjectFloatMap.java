package com.composables.core.androidx.collection;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.b.f;
import com.composables.core.androidx.collection.internal.ContainerHelpersKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.invertase.googlemobileads.BuildConfig;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import org.apache.commons.codec.language.bm.Languages;

/* compiled from: ObjectFloatMap.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u001f¢\u0006\u0002\u0010$J'\u0010%\u001a\u00020\u001f2\u0006\u0010 \u001a\u00028\u00002\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0&H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010'J/\u0010(\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020)0+H\u0081\bø\u0001\u0000JD\u0010/\u001a\u00020)26\u0010*\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001f¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020)00H\u0086\bø\u0001\u0000J/\u00102\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b( \u0012\u0004\u0012\u00020)0+H\u0086\bø\u0001\u0000J/\u00103\u001a\u00020)2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020)0+H\u0086\bø\u0001\u0000J&\u00104\u001a\u00020\u001a2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a00H\u0086\bø\u0001\u0000J&\u0010\u0019\u001a\u00020\u001a2\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a00H\u0086\bø\u0001\u0000J\u0006\u00106\u001a\u00020\u0010J&\u00106\u001a\u00020\u00102\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a00H\u0086\bø\u0001\u0000J\u0016\u00107\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\u001a2\u0006\u0010 \u001a\u00028\u0000¢\u0006\u0002\u00108J\u000e\u0010:\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u001fJ:\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020>H\u0007Jx\u0010;\u001a\u00020<2\b\b\u0002\u0010=\u001a\u00020>2\b\b\u0002\u0010?\u001a\u00020>2\b\b\u0002\u0010@\u001a\u00020>2\b\b\u0002\u0010A\u001a\u00020\u00102\b\b\u0002\u0010B\u001a\u00020>28\b\u0004\u0010C\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b( \u0012\u0013\u0012\u00110\u001f¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020>00H\u0087\bø\u0001\u0000J\b\u0010D\u001a\u00020\u0010H\u0016J\u0013\u0010E\u001a\u00020\u001a2\b\u0010F\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010G\u001a\u00020<H\u0016J\u0015\u0010H\u001a\u00020\u00102\u0006\u0010 \u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010IR\u0018\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0004R\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\n\u0010\u0004R\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0004R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0016\u0010\u0004R\u0011\u0010\u0017\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\u0082\u0001\u0001J\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006K"}, d2 = {"Lcom/composables/core/androidx/collection/ObjectFloatMap;", "K", "", "<init>", "()V", TtmlNode.TAG_METADATA, "", "getMetadata$annotations", UserMetadata.KEYDATA_FILENAME, "", "getKeys$annotations", "[Ljava/lang/Object;", "values", "", "getValues$annotations", "_capacity", "", "get_capacity$core_release$annotations", "capacity", "getCapacity", "()I", "_size", "get_size$core_release$annotations", "size", "getSize", Languages.ANY, "", "none", "isEmpty", "isNotEmpty", b.au, "", "key", "(Ljava/lang/Object;)F", "getOrDefault", "defaultValue", "(Ljava/lang/Object;F)F", "getOrElse", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)F", "forEachIndexed", "", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "forEach", "Lkotlin/Function2;", "value", "forEachKey", "forEachValue", "all", "predicate", NewHtcHomeBadger.COUNT, "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", ViewProps.TRANSFORM, "hashCode", "equals", "other", InAppPurchaseConstants.METHOD_TO_STRING, "findKeyIndex", "(Ljava/lang/Object;)I", "Lcom/composables/core/androidx/collection/MutableObjectFloatMap;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ObjectFloatMap<K> {
    public static final int $stable = 8;
    public int _capacity;
    public int _size;
    public Object[] keys;
    public long[] metadata;
    public float[] values;

    public /* synthetic */ ObjectFloatMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$core_release$annotations() {
    }

    public static /* synthetic */ void get_size$core_release$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final String joinToString(CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int i) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i, null, 16, null);
    }

    private ObjectFloatMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = ContainerHelpersKt.EMPTY_OBJECTS;
        this.values = FloatSetKt.getEmptyFloatArray();
    }

    /* renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    /* renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final float get(K key) {
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex < 0) {
            throw new NoSuchElementException("There is no key " + key + " in the map");
        }
        return this.values[findKeyIndex];
    }

    public final float getOrDefault(K key, float defaultValue) {
        int findKeyIndex = findKeyIndex(key);
        return findKeyIndex >= 0 ? this.values[findKeyIndex] : defaultValue;
    }

    public final float getOrElse(K key, Function0<Float> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(key);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        return defaultValue.invoke().floatValue();
    }

    public final void forEachIndexed(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(Integer.valueOf((i << 3) + i3));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEach(Function2<? super K, ? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        block.invoke(objArr[i4], Float.valueOf(fArr[i4]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachKey(Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void forEachValue(Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        block.invoke(Float.valueOf(fArr[(i << 3) + i3]));
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int count() {
        return get_size();
    }

    public final boolean contains(K key) {
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(K key) {
        return findKeyIndex(key) >= 0;
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i2 & 1) != 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return objectFloatMap.joinToString(charSequence, charSequence2, charSequence6, i, charSequence5);
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated) {
        Object[] objArr;
        Object[] objArr2;
        int i;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i2 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i2 << 3) + i6;
                            i = i4;
                            Object obj = objArr3[i7];
                            float f = fArr[i7];
                            objArr2 = objArr3;
                            if (i3 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(separator);
                            }
                            sb.append(obj);
                            sb.append('=');
                            sb.append(f);
                            i3++;
                        } else {
                            objArr2 = objArr3;
                            i = i4;
                        }
                        j >>= i;
                        i6++;
                        objArr3 = objArr2;
                        i4 = i;
                    }
                    objArr = objArr3;
                    if (i5 != i4) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
            }
        }
        sb.append(postfix);
        return sb.toString();
    }

    public static /* synthetic */ String joinToString$default(ObjectFloatMap objectFloatMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function2 transform, int i2, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i3;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i2 & 1) != 0 ? ", " : charSequence;
        CharSequence prefix = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i2 & 4) != 0 ? "" : charSequence3;
        int i4 = (i2 & 8) != 0 ? -1 : i;
        CharSequence truncated = (i2 & 16) != 0 ? "..." : charSequence4;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = objectFloatMap.keys;
        float[] fArr = objectFloatMap.values;
        long[] jArr3 = objectFloatMap.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            int i6 = 0;
            loop0: while (true) {
                long j = jArr3[i5];
                int i7 = i5;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            i3 = i8;
                            Object obj2 = objArr[i11];
                            float f = fArr[i11];
                            if (i6 == i4) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i6 != 0) {
                                sb.append(separator);
                            }
                            jArr2 = jArr3;
                            sb.append((CharSequence) transform.invoke(obj2, Float.valueOf(f)));
                            i6++;
                        } else {
                            jArr2 = jArr3;
                            i3 = i8;
                        }
                        j >>= i3;
                        i10++;
                        i8 = i3;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i9 != i8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i7 == length) {
                    break;
                }
                i5 = i7 + 1;
                jArr3 = jArr;
            }
            return sb.toString();
        }
        sb.append(postfix);
        return sb.toString();
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function2<? super K, ? super Float, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator2 = separator;
        Intrinsics.checkNotNullParameter(separator2, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr3[i6];
                            float f = fArr[i6];
                            objArr2 = objArr3;
                            if (i2 == limit) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator2);
                            }
                            sb.append(transform.invoke(obj, Float.valueOf(f)));
                            i2++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i5++;
                        separator2 = separator;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                separator2 = separator;
                objArr3 = objArr;
            }
            return sb.toString();
        }
        sb.append(postfix);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ObjectFloatMap)) {
            return false;
        }
        ObjectFloatMap objectFloatMap = (ObjectFloatMap) other;
        if (objectFloatMap.get_size() != get_size()) {
            return false;
        }
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (fArr[i4] != objectFloatMap.get(objArr[i4])) {
                                return false;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public String toString() {
        if (isEmpty()) {
            return BuildConfig.GOOGLE_MOBILE_ADS_JSON_RAW;
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            Object obj = objArr[i5];
                            float f = fArr[i5];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(f.b);
                            sb.append(f);
                            i2++;
                            if (i2 < this._size) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        String sb2 = sb.append(AbstractJsonLexerKt.END_OBJ).toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final boolean all(Function2<? super K, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        if (!predicate.invoke(objArr[i4], Float.valueOf(fArr[i4])).booleanValue()) {
                            return false;
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return true;
                }
            }
            if (i == length) {
                return true;
            }
            i++;
        }
    }

    public final boolean any(Function2<? super K, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (predicate.invoke(objArr[i4], Float.valueOf(fArr[i4])).booleanValue()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public final int count(Function2<? super K, ? super Float, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        if (predicate.invoke(objArr[i5], Float.valueOf(fArr[i5])).booleanValue()) {
                            i2++;
                        }
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final boolean containsValue(float value) {
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && value == fArr[(i << 3) + i3]) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        i2 += Float.hashCode(fArr[i5]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return i2;
                }
            }
            if (i == length) {
                return i2;
            }
            i++;
        }
    }

    public final int findKeyIndex(K key) {
        int i = 0;
        int hashCode = (key != null ? key.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this._capacity;
        int i5 = i2 >>> 7;
        while (true) {
            int i6 = i5 & i4;
            long[] jArr = this.metadata;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (Intrinsics.areEqual(this.keys[numberOfTrailingZeros], key)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i5 = i6 + i;
        }
    }

    public final String joinToString(CharSequence charSequence, CharSequence prefix, CharSequence postfix, int i, Function2<? super K, ? super Float, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator = charSequence;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j & 255) < 128) {
                            int i7 = (i4 << 3) + i6;
                            Object obj = objArr3[i7];
                            float f = fArr[i7];
                            objArr2 = objArr3;
                            if (i3 == i) {
                                sb.append((CharSequence) r5);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Float.valueOf(f)));
                            i3++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i6++;
                        separator = charSequence;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
                separator = charSequence;
                objArr3 = objArr;
            }
            return sb.toString();
        }
        sb.append(postfix);
        return sb.toString();
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, Function2<? super K, ? super Float, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr3[i6];
                            float f = fArr[i6];
                            objArr2 = objArr3;
                            if (i2 == -1) {
                                sb.append((CharSequence) r5);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Float.valueOf(f)));
                            i2++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i5++;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                objArr3 = objArr;
            }
        }
        sb.append(postfix);
        return sb.toString();
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, Function2<? super K, ? super Float, ? extends CharSequence> transform) {
        Object[] objArr;
        Object[] objArr2;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr3 = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            int i2 = 0;
            loop0: while (true) {
                long j = jArr[i];
                int i3 = i;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i3 << 3) + i5;
                            Object obj = objArr3[i6];
                            float f = fArr[i6];
                            objArr2 = objArr3;
                            if (i2 == -1) {
                                sb.append((CharSequence) r5);
                                break loop0;
                            }
                            if (i2 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Float.valueOf(f)));
                            i2++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j >>= 8;
                        i5++;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i4 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i3 == length) {
                    break;
                }
                i = i3 + 1;
                objArr3 = objArr;
            }
        }
        sb.append((CharSequence) r4);
        return sb.toString();
    }

    public final String joinToString(CharSequence separator, Function2<? super K, ? super Float, ? extends CharSequence> transform) {
        int i;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i = i5;
                            Object obj = objArr[i8];
                            float f = fArr[i8];
                            if (i3 == -1) {
                                sb.append((CharSequence) r5);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append(separator);
                            }
                            sb.append(transform.invoke(obj, Float.valueOf(f)));
                            i3++;
                        } else {
                            i = i5;
                        }
                        j >>= i;
                        i7++;
                        i5 = i;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
            }
        }
        sb.append((CharSequence) r3);
        return sb.toString();
    }

    public final String joinToString(Function2<? super K, ? super Float, ? extends CharSequence> transform) {
        int i;
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        Object[] objArr = this.keys;
        float[] fArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j = jArr[i2];
                int i4 = i2;
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i = i5;
                            Object obj = objArr[i8];
                            float f = fArr[i8];
                            if (i3 == -1) {
                                sb.append((CharSequence) r5);
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append((CharSequence) r2);
                            }
                            sb.append(transform.invoke(obj, Float.valueOf(f)));
                            i3++;
                        } else {
                            i = i5;
                        }
                        j >>= i;
                        i7++;
                        i5 = i;
                    }
                    if (i6 != i5) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i2 = i4 + 1;
            }
        }
        sb.append((CharSequence) r3);
        return sb.toString();
    }
}
