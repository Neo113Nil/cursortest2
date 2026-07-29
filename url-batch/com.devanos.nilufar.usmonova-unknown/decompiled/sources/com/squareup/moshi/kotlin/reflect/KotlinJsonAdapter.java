package com.squareup.moshi.kotlin.reflect;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.internal.Util;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0786bc;
import o.AbstractC0868ct;
import o.C0362Nw;
import o.C1661ox;
import o.H;
import o.InterfaceC0310Lw;
import o.InterfaceC0596Ww;
import o.InterfaceC1396kw;
import o.InterfaceC2253xw;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002%&BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "Lo/kw;", "constructor", "", "Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "", "allBindings", "nonIgnoredBindings", "Lcom/squareup/moshi/JsonReader$Options;", "options", "<init>", "(Lo/kw;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "Lcom/squareup/moshi/JsonWriter;", "writer", "value", "Lo/bY;", "toJson", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lo/kw;", "getConstructor", "()Lo/kw;", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "getNonIgnoredBindings", "Lcom/squareup/moshi/JsonReader$Options;", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "Binding", "IndexedParameterMap", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinJsonAdapter<T> extends JsonAdapter<T> {
    private final List<Binding<T, Object>> allBindings;
    private final InterfaceC1396kw constructor;
    private final List<Binding<T, Object>> nonIgnoredBindings;
    private final JsonReader.Options options;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jb\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b2\u0010 ¨\u00063"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "K", "P", "", "", "jsonName", "Lcom/squareup/moshi/JsonAdapter;", "adapter", "Lo/Ww;", "property", "Lo/Lw;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lo/Ww;Lo/Lw;I)V", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "Lo/bY;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/squareup/moshi/JsonAdapter;", "component3", "()Lo/Ww;", "component4", "()Lo/Lw;", "component5", "()I", "copy", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lo/Ww;Lo/Lw;I)Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$Binding;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getJsonName", "Lcom/squareup/moshi/JsonAdapter;", "getAdapter", "Lo/Ww;", "getProperty", "Lo/Lw;", "getParameter", "I", "getPropertyIndex", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Binding<K, P> {
        private final JsonAdapter<P> adapter;
        private final String jsonName;
        private final InterfaceC0310Lw parameter;
        private final InterfaceC0596Ww property;
        private final int propertyIndex;

        public Binding(String str, JsonAdapter<P> jsonAdapter, InterfaceC0596Ww interfaceC0596Ww, InterfaceC0310Lw interfaceC0310Lw, int i) {
            AbstractC0048Bt.n(str, "jsonName");
            AbstractC0048Bt.n(jsonAdapter, "adapter");
            AbstractC0048Bt.n(interfaceC0596Ww, "property");
            this.jsonName = str;
            this.adapter = jsonAdapter;
            this.property = interfaceC0596Ww;
            this.parameter = interfaceC0310Lw;
            this.propertyIndex = i;
        }

        public static /* synthetic */ Binding copy$default(Binding binding, String str, JsonAdapter jsonAdapter, InterfaceC0596Ww interfaceC0596Ww, InterfaceC0310Lw interfaceC0310Lw, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = binding.jsonName;
            }
            if ((i2 & 2) != 0) {
                jsonAdapter = binding.adapter;
            }
            if ((i2 & 4) != 0) {
                interfaceC0596Ww = binding.property;
            }
            if ((i2 & 8) != 0) {
                interfaceC0310Lw = binding.parameter;
            }
            if ((i2 & 16) != 0) {
                i = binding.propertyIndex;
            }
            int i3 = i;
            InterfaceC0596Ww interfaceC0596Ww2 = interfaceC0596Ww;
            return binding.copy(str, jsonAdapter, interfaceC0596Ww2, interfaceC0310Lw, i3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getJsonName() {
            return this.jsonName;
        }

        public final JsonAdapter<P> component2() {
            return this.adapter;
        }

        /* renamed from: component3, reason: from getter */
        public final InterfaceC0596Ww getProperty() {
            return this.property;
        }

        /* renamed from: component4, reason: from getter */
        public final InterfaceC0310Lw getParameter() {
            return this.parameter;
        }

        /* renamed from: component5, reason: from getter */
        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        public final Binding<K, P> copy(String jsonName, JsonAdapter<P> adapter, InterfaceC0596Ww property, InterfaceC0310Lw parameter, int propertyIndex) {
            AbstractC0048Bt.n(jsonName, "jsonName");
            AbstractC0048Bt.n(adapter, "adapter");
            AbstractC0048Bt.n(property, "property");
            return new Binding<>(jsonName, adapter, property, parameter, propertyIndex);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Binding)) {
                return false;
            }
            Binding binding = (Binding) other;
            return AbstractC0048Bt.h(this.jsonName, binding.jsonName) && AbstractC0048Bt.h(this.adapter, binding.adapter) && AbstractC0048Bt.h(this.property, binding.property) && AbstractC0048Bt.h(this.parameter, binding.parameter) && this.propertyIndex == binding.propertyIndex;
        }

        public final P get(K value) {
            return (P) this.property.get(value);
        }

        public final JsonAdapter<P> getAdapter() {
            return this.adapter;
        }

        public final String getJsonName() {
            return this.jsonName;
        }

        public final InterfaceC0310Lw getParameter() {
            return this.parameter;
        }

        public final InterfaceC0596Ww getProperty() {
            return this.property;
        }

        public final int getPropertyIndex() {
            return this.propertyIndex;
        }

        public int hashCode() {
            int hashCode = (this.property.hashCode() + ((this.adapter.hashCode() + (this.jsonName.hashCode() * 31)) * 31)) * 31;
            InterfaceC0310Lw interfaceC0310Lw = this.parameter;
            return Integer.hashCode(this.propertyIndex) + ((hashCode + (interfaceC0310Lw == null ? 0 : interfaceC0310Lw.hashCode())) * 31);
        }

        public final void set(K result, P value) {
            Object obj;
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            if (value != obj) {
                InterfaceC0596Ww interfaceC0596Ww = this.property;
                AbstractC0048Bt.l(interfaceC0596Ww, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                ((InterfaceC2253xw) interfaceC0596Ww).c(result, value);
            }
        }

        public String toString() {
            return "Binding(jsonName=" + this.jsonName + ", adapter=" + this.adapter + ", property=" + this.property + ", parameter=" + this.parameter + ", propertyIndex=" + this.propertyIndex + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R(\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00160\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapter$IndexedParameterMap;", "Lo/H;", "Lo/Lw;", "", "", "parameterKeys", "", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", "key", "value", "put", "(Lo/Lw;Ljava/lang/Object;)Ljava/lang/Object;", "", "containsKey", "(Lo/Lw;)Z", "get", "(Lo/Lw;)Ljava/lang/Object;", "Ljava/util/List;", "[Ljava/lang/Object;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IndexedParameterMap extends H {
        private final List<InterfaceC0310Lw> parameterKeys;
        private final Object[] parameterValues;

        /* JADX WARN: Multi-variable type inference failed */
        public IndexedParameterMap(List<? extends InterfaceC0310Lw> list, Object[] objArr) {
            AbstractC0048Bt.n(list, "parameterKeys");
            AbstractC0048Bt.n(objArr, "parameterValues");
            this.parameterKeys = list;
            this.parameterValues = objArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof InterfaceC0310Lw) {
                return containsKey((InterfaceC0310Lw) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof InterfaceC0310Lw) {
                return get((InterfaceC0310Lw) obj);
            }
            return null;
        }

        @Override // o.H
        public Set<Map.Entry<InterfaceC0310Lw, Object>> getEntries() {
            Object obj;
            List<InterfaceC0310Lw> list = this.parameterKeys;
            ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(list));
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0868ct.Y();
                    throw null;
                }
                arrayList.add(new AbstractMap.SimpleEntry((InterfaceC0310Lw) t, this.parameterValues[i]));
                i = i2;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object value = ((AbstractMap.SimpleEntry) next).getValue();
                obj = KotlinJsonAdapterKt.ABSENT_VALUE;
                if (value != obj) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof InterfaceC0310Lw) ? obj2 : getOrDefault((InterfaceC0310Lw) obj, obj2);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Object put(InterfaceC0310Lw key, Object value) {
            AbstractC0048Bt.n(key, "key");
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof InterfaceC0310Lw) {
                return remove((InterfaceC0310Lw) obj);
            }
            return null;
        }

        public boolean containsKey(InterfaceC0310Lw key) {
            Object obj;
            AbstractC0048Bt.n(key, "key");
            Object obj2 = this.parameterValues[((C0362Nw) key).i];
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            return obj2 != obj;
        }

        public Object get(InterfaceC0310Lw key) {
            Object obj;
            AbstractC0048Bt.n(key, "key");
            Object obj2 = this.parameterValues[((C0362Nw) key).i];
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            if (obj2 != obj) {
                return obj2;
            }
            return null;
        }

        public /* bridge */ Object getOrDefault(InterfaceC0310Lw interfaceC0310Lw, Object obj) {
            return super.getOrDefault((Object) interfaceC0310Lw, (InterfaceC0310Lw) obj);
        }

        public /* bridge */ Object remove(InterfaceC0310Lw interfaceC0310Lw) {
            return super.remove((Object) interfaceC0310Lw);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj instanceof InterfaceC0310Lw) {
                return remove((InterfaceC0310Lw) obj, obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(InterfaceC0310Lw interfaceC0310Lw, Object obj) {
            return super.remove((Object) interfaceC0310Lw, obj);
        }
    }

    public KotlinJsonAdapter(InterfaceC1396kw interfaceC1396kw, List<Binding<T, Object>> list, List<Binding<T, Object>> list2, JsonReader.Options options) {
        AbstractC0048Bt.n(interfaceC1396kw, "constructor");
        AbstractC0048Bt.n(list, "allBindings");
        AbstractC0048Bt.n(list2, "nonIgnoredBindings");
        AbstractC0048Bt.n(options, "options");
        this.constructor = interfaceC1396kw;
        this.allBindings = list;
        this.nonIgnoredBindings = list2;
        this.options = options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public T fromJson(JsonReader reader) {
        Object obj;
        Object obj2;
        Object obj3;
        AbstractC0048Bt.n(reader, "reader");
        int size = this.constructor.getParameters().size();
        int size2 = this.allBindings.size();
        Object[] objArr = new Object[size2];
        for (int i = 0; i < size2; i++) {
            obj3 = KotlinJsonAdapterKt.ABSENT_VALUE;
            objArr[i] = obj3;
        }
        reader.beginObject();
        while (reader.hasNext()) {
            int selectName = reader.selectName(this.options);
            if (selectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else {
                Binding<T, Object> binding = this.nonIgnoredBindings.get(selectName);
                int propertyIndex = binding.getPropertyIndex();
                Object obj4 = objArr[propertyIndex];
                obj2 = KotlinJsonAdapterKt.ABSENT_VALUE;
                if (obj4 != obj2) {
                    throw new JsonDataException("Multiple values for '" + binding.getProperty().getName() + "' at " + reader.getPath());
                }
                Object fromJson = binding.getAdapter().fromJson(reader);
                objArr[propertyIndex] = fromJson;
                if (fromJson == null && !((C1661ox) binding.getProperty().getReturnType()).h.C0()) {
                    JsonDataException unexpectedNull = Util.unexpectedNull(binding.getProperty().getName(), binding.getJsonName(), reader);
                    AbstractC0048Bt.m(unexpectedNull, "unexpectedNull(\n        …         reader\n        )");
                    throw unexpectedNull;
                }
            }
        }
        reader.endObject();
        boolean z = this.allBindings.size() == size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj5 = objArr[i2];
            obj = KotlinJsonAdapterKt.ABSENT_VALUE;
            if (obj5 == obj) {
                if (((C0362Nw) ((InterfaceC0310Lw) this.constructor.getParameters().get(i2))).l()) {
                    z = false;
                } else {
                    if (!((C0362Nw) ((InterfaceC0310Lw) this.constructor.getParameters().get(i2))).i().h.C0()) {
                        String name = ((C0362Nw) ((InterfaceC0310Lw) this.constructor.getParameters().get(i2))).getName();
                        Binding<T, Object> binding2 = this.allBindings.get(i2);
                        JsonDataException missingProperty = Util.missingProperty(name, binding2 != null ? binding2.getJsonName() : null, reader);
                        AbstractC0048Bt.m(missingProperty, "missingProperty(\n       …       reader\n          )");
                        throw missingProperty;
                    }
                    objArr[i2] = null;
                }
            }
        }
        T t = z ? (T) this.constructor.call(Arrays.copyOf(objArr, size2)) : (T) this.constructor.callBy(new IndexedParameterMap(this.constructor.getParameters(), objArr));
        int size3 = this.allBindings.size();
        while (size < size3) {
            Binding<T, Object> binding3 = this.allBindings.get(size);
            AbstractC0048Bt.k(binding3);
            binding3.set(t, objArr[size]);
            size++;
        }
        return t;
    }

    public final List<Binding<T, Object>> getAllBindings() {
        return this.allBindings;
    }

    public final InterfaceC1396kw getConstructor() {
        return this.constructor;
    }

    public final List<Binding<T, Object>> getNonIgnoredBindings() {
        return this.nonIgnoredBindings;
    }

    public final JsonReader.Options getOptions() {
        return this.options;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, T value) {
        AbstractC0048Bt.n(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value == null");
        }
        writer.beginObject();
        for (Binding<T, Object> binding : this.allBindings) {
            if (binding != null) {
                writer.name(binding.getJsonName());
                binding.getAdapter().toJson(writer, (JsonWriter) binding.get(value));
            }
        }
        writer.endObject();
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.constructor.getReturnType() + ')';
    }
}
