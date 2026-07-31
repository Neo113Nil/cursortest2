package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.VastUrlProcessorRegistry;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* loaded from: classes10.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        VastUrlProcessorRegistry.a aVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aVar.add(arrayList.get(i).freeze());
        }
        return aVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        VastUrlProcessorRegistry.a aVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            aVar.add(it.next().freeze());
        }
        return aVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        VastUrlProcessorRegistry.a aVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            aVar.add(e.freeze());
        }
        return aVar;
    }
}
