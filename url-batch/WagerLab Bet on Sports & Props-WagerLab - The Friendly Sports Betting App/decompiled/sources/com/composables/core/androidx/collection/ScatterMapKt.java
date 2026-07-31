package com.composables.core.androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.amazon.a.a.o.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScatterMap.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0013\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015\u001a\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u000f\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u0015\u001aO\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u000f\"\u0004\b\u0000\u0010\u0014\"\u0004\b\u0001\u0010\u00152*\u0010\u0017\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u00190\u0018\"\u000e\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\u00150\u0019¢\u0006\u0002\u0010\u001a\u001a\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\nH\u0000\u001a \u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\nH\u0000\u001a\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0010H\u0080\b\u001a\u0011\u0010%\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0011\u0010&\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nH\u0080\b\u001a\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0000\u001a\u0010\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0000\u001a\u0010\u0010*\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0000\u001a\u0010\u0010+\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0000\u001a\u0019\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\nH\u0081\b\u001a)\u0010/\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0001H\u0080\b\u001a!\u00101\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\n2\u0006\u00100\u001a\u00020\u0001H\u0080\b\u001a\u0019\u00102\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\b2\u0006\u00104\u001a\u00020\nH\u0080\b\u001a\u0019\u00105\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\b2\u0006\u00104\u001a\u00020\nH\u0080\b\u001a\u0019\u00106\u001a\u0002032\u0006\u0010\u001d\u001a\u00020\b2\u0006\u00104\u001a\u00020\nH\u0080\b\u001a\u0011\u00106\u001a\u0002032\u0006\u00100\u001a\u00020\u0001H\u0081\b\u001a\u0011\u00109\u001a\u00020\n*\u00060\u0001j\u0002`:H\u0081\b\u001a\u0011\u0010;\u001a\u00020\n*\u00060\u0001j\u0002`<H\u0080\b\u001a\u0011\u0010=\u001a\u00020\u0001*\u00060\u0001j\u0002`<H\u0080\b\u001a\u0011\u0010>\u001a\u000203*\u00060\u0001j\u0002`<H\u0080\b\u001a\u001d\u0010C\u001a\u00060\u0001j\u0002`D2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010.\u001a\u00020\nH\u0080\b\u001a\u001d\u0010E\u001a\u00060\u0001j\u0002`<*\u00060\u0001j\u0002`D2\u0006\u0010F\u001a\u00020\nH\u0081\b\u001a\u0015\u0010G\u001a\u00060\u0001j\u0002`<*\u00060\u0001j\u0002`DH\u0080\b\u001a\u0015\u0010H\u001a\u00060\u0001j\u0002`<*\u00060\u0001j\u0002`DH\u0081\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010?\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u0006\"\u0016\u0010A\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\bB\u0010\u0006*\f\b\u0000\u0010\u000b\"\u00020\u00012\u00020\u0001*\f\b\u0000\u00107\"\u00020\u00012\u00020\u0001*\f\b\u0000\u00108\"\u00020\u00012\u00020\u0001¨\u0006I"}, d2 = {"AllEmpty", "", "Empty", "Deleted", "Sentinel", "getSentinel$annotations", "()V", "EmptyGroup", "", "GroupWidth", "", "Group", "ClonedMetadataCount", "DefaultScatterCapacity", "EmptyScatterMap", "Lcom/composables/core/androidx/collection/MutableScatterMap;", "", "", "emptyScatterMap", "Lcom/composables/core/androidx/collection/ScatterMap;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "mutableScatterMapOf", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lcom/composables/core/androidx/collection/MutableScatterMap;", "convertMetadataForCleanup", "", TtmlNode.TAG_METADATA, "capacity", "findEmptySlot", "start", "end", "hash", "k", "MurmurHashC1", "h1", "h2", "nextCapacity", "normalizeCapacity", "n", "loadedCapacity", "unloadedCapacity", "readRawMetadata", "data", "offset", "writeMetadata", "value", "writeRawMetadata", "isEmpty", "", FirebaseAnalytics.Param.INDEX, "isDeleted", "isFull", "StaticBitmask", "Bitmask", "lowestBitSet", "Lcom/composables/core/androidx/collection/StaticBitmask;", b.au, "Lcom/composables/core/androidx/collection/Bitmask;", "next", "hasNext", "BitmaskLsb", "getBitmaskLsb$annotations", "BitmaskMsb", "getBitmaskMsb$annotations", "group", "Lcom/composables/core/androidx/collection/Group;", "match", CmcdData.OBJECT_TYPE_MANIFEST, "maskEmpty", "maskEmptyOrDeleted", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScatterMapKt {
    public static final long AllEmpty = -9187201950435737472L;
    public static final long BitmaskLsb = 72340172838076673L;
    public static final long BitmaskMsb = -9187201950435737472L;
    public static final int ClonedMetadataCount = 7;
    public static final int DefaultScatterCapacity = 6;
    public static final long Deleted = 254;
    public static final long Empty = 128;
    public static final long[] EmptyGroup = {-9187201950435737345L, -1};
    private static final MutableScatterMap EmptyScatterMap = new MutableScatterMap(0);
    public static final int GroupWidth = 8;
    public static final int MurmurHashC1 = -862048943;
    public static final long Sentinel = 255;

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }

    public static final int h1(int i) {
        return i >>> 7;
    }

    public static final int h2(int i) {
        return i & 127;
    }

    public static final boolean hasNext(long j) {
        return j != 0;
    }

    public static final boolean isFull(long j) {
        return j < 128;
    }

    public static final long maskEmpty(long j) {
        return j & ((~j) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j) {
        return j & ((~j) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j, int i) {
        long j2 = j ^ (i * 72340172838076673L);
        return (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
    }

    public static final long next(long j) {
        return j & (j - 1);
    }

    public static final int nextCapacity(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final <K, V> ScatterMap<K, V> emptyScatterMap() {
        MutableScatterMap mutableScatterMap = EmptyScatterMap;
        Intrinsics.checkNotNull(mutableScatterMap, "null cannot be cast to non-null type com.composables.core.androidx.collection.ScatterMap<K of com.composables.core.androidx.collection.ScatterMapKt.emptyScatterMap, V of com.composables.core.androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf() {
        return new MutableScatterMap<>(0, 1, null);
    }

    public static final <K, V> MutableScatterMap<K, V> mutableScatterMapOf(Pair<? extends K, ? extends V>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.putAll(pairs);
        return mutableScatterMap;
    }

    public static final void convertMetadataForCleanup(long[] metadata, int i) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = metadata[i3] & (-9187201950435737472L);
            metadata[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(metadata);
        int i4 = lastIndex - 1;
        metadata[i4] = (metadata[i4] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex] = metadata[0];
    }

    public static final int hash(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        return hashCode ^ (hashCode << 16);
    }

    public static final int normalizeCapacity(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }

    public static final int loadedCapacity(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int unloadedCapacity(int i) {
        if (i == 7) {
            return 8;
        }
        return i + ((i - 1) / 7);
    }

    public static final long readRawMetadata(long[] data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (data[i >> 3] >> ((i & 7) << 3)) & 255;
    }

    public static final void writeRawMetadata(long[] data, int i, long j) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        data[i2] = (j << i3) | (data[i2] & (~(255 << i3)));
    }

    public static final int lowestBitSet(long j) {
        return Long.numberOfTrailingZeros(j) >> 3;
    }

    public static final long group(long[] metadata, int i) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        int i2 = i >> 3;
        int i3 = (i & 7) << 3;
        return (((-i3) >> 63) & (metadata[i2 + 1] << (64 - i3))) | (metadata[i2] >>> i3);
    }

    public static final int findEmptySlot(long[] metadata, int i, int i2) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        while (i < i2) {
            if (((metadata[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void writeMetadata(long[] data, int i, int i2, long j) {
        Intrinsics.checkNotNullParameter(data, "data");
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        long j2 = (j << i4) | (data[i3] & (~(255 << i4)));
        data[i3] = j2;
        data[(((i2 - 7) & i) + (i & 7)) >> 3] = j2;
    }

    public static final boolean isEmpty(long[] metadata, int i) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i >> 3] >> ((i & 7) << 3)) & 255) == 128;
    }

    public static final boolean isDeleted(long[] metadata, int i) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i >> 3] >> ((i & 7) << 3)) & 255) == 254;
    }

    public static final boolean isFull(long[] metadata, int i) {
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i >> 3] >> ((i & 7) << 3)) & 255) < 128;
    }

    public static final int get(long j) {
        return Long.numberOfTrailingZeros(j) >> 3;
    }
}
