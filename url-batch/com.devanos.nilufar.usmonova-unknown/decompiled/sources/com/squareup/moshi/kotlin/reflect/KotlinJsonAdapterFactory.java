package com.squareup.moshi.kotlin.reflect;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi._MoshiKotlinTypesExtensionsKt;
import com.squareup.moshi.internal.Util;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o.AbstractC0022At;
import o.AbstractC0048Bt;
import o.AbstractC0491Sv;
import o.AbstractC0720ac;
import o.AbstractC0786bc;
import o.AbstractC1048fc;
import o.AbstractC1305jX;
import o.AbstractC1473m3;
import o.C0362Nw;
import o.C0621Xv;
import o.C0740aw;
import o.C1528mw;
import o.C1661ox;
import o.C1990tx;
import o.EB;
import o.InterfaceC0310Lw;
import o.InterfaceC0517Tv;
import o.InterfaceC0596Ww;
import o.InterfaceC0629Yd;
import o.InterfaceC0937dx;
import o.InterfaceC1068fw;
import o.InterfaceC1396kw;
import o.InterfaceC1463lx;
import o.InterfaceC1727px;
import o.InterfaceC2253xw;
import o.PX;
import o.RM;
import o.SM;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/squareup/moshi/kotlin/reflect/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KotlinJsonAdapterFactory implements JsonAdapter.Factory {
    /* JADX WARN: Code restructure failed: missing block: B:106:0x027b, code lost:
    
        if (r10 == null) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18, types: [java.lang.Object] */
    @Override // com.squareup.moshi.JsonAdapter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonAdapter<?> create(Type type, Set<? extends Annotation> annotations, Moshi moshi) {
        Class<? extends Annotation> cls;
        Object obj;
        Object obj2;
        String name;
        Type R;
        Json json;
        AbstractC0048Bt.n(type, "type");
        AbstractC0048Bt.n(annotations, "annotations");
        AbstractC0048Bt.n(moshi, "moshi");
        String str = null;
        if (annotations.isEmpty()) {
            Class<?> rawType = _MoshiKotlinTypesExtensionsKt.getRawType(type);
            if (!rawType.isInterface() && !rawType.isEnum()) {
                cls = KotlinJsonAdapterKt.KOTLIN_METADATA;
                if (rawType.isAnnotationPresent(cls) && !Util.isPlatformType(rawType)) {
                    try {
                        JsonAdapter<?> generatedAdapter = Util.generatedAdapter(moshi, type, rawType);
                        if (generatedAdapter != null) {
                            return generatedAdapter;
                        }
                    } catch (RuntimeException e) {
                        if (!(e.getCause() instanceof ClassNotFoundException)) {
                            throw e;
                        }
                    }
                    if (rawType.isLocalClass()) {
                        throw new IllegalArgumentException("Cannot serialize local class or object expression ".concat(rawType.getName()).toString());
                    }
                    InterfaceC0517Tv G = AbstractC1473m3.G(rawType);
                    if (G.isAbstract()) {
                        throw new IllegalArgumentException("Cannot serialize abstract class ".concat(rawType.getName()).toString());
                    }
                    if (G.k()) {
                        throw new IllegalArgumentException("Cannot serialize inner class ".concat(rawType.getName()).toString());
                    }
                    if (G.h() != null) {
                        throw new IllegalArgumentException("Cannot serialize object declaration ".concat(rawType.getName()).toString());
                    }
                    if (G.d()) {
                        throw new IllegalArgumentException(("Cannot reflectively serialize sealed class " + rawType.getName() + ". Please register an adapter.").toString());
                    }
                    SM sm = ((C0740aw) G).j;
                    RM rm = ((C0621Xv) sm.invoke()).f;
                    InterfaceC0937dx interfaceC0937dx = C0621Xv.n[4];
                    Object invoke = rm.invoke();
                    AbstractC0048Bt.m(invoke, "<get-constructors>(...)");
                    Iterator it = ((Collection) invoke).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        InterfaceC1396kw interfaceC1396kw = (InterfaceC1396kw) obj;
                        AbstractC0048Bt.l(interfaceC1396kw, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
                        if (((InterfaceC0629Yd) ((C1528mw) interfaceC1396kw).p()).H()) {
                            break;
                        }
                    }
                    InterfaceC1396kw interfaceC1396kw2 = (InterfaceC1396kw) obj;
                    if (interfaceC1396kw2 != null) {
                        List parameters = interfaceC1396kw2.getParameters();
                        int E = EB.E(AbstractC0786bc.d0(parameters));
                        if (E < 16) {
                            E = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
                        for (Object obj3 : parameters) {
                            linkedHashMap.put(((C0362Nw) ((InterfaceC0310Lw) obj3)).getName(), obj3);
                        }
                        AbstractC0022At.J(interfaceC1396kw2);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        RM rm2 = ((C0621Xv) sm.invoke()).l;
                        InterfaceC0937dx interfaceC0937dx2 = C0621Xv.n[14];
                        Object invoke2 = rm2.invoke();
                        AbstractC0048Bt.m(invoke2, "<get-allNonStaticMembers>(...)");
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : (Collection) invoke2) {
                            AbstractC0491Sv abstractC0491Sv = (AbstractC0491Sv) obj4;
                            if (abstractC0491Sv.p().J() == null && (abstractC0491Sv instanceof InterfaceC0596Ww)) {
                                arrayList.add(obj4);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            InterfaceC0596Ww interfaceC0596Ww = (InterfaceC0596Ww) it2.next();
                            InterfaceC0310Lw interfaceC0310Lw = (InterfaceC0310Lw) linkedHashMap.get(interfaceC0596Ww.getName());
                            AbstractC0022At.J(interfaceC0596Ww);
                            Iterator it3 = interfaceC0596Ww.getAnnotations().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj2 = str;
                                    break;
                                }
                                obj2 = it3.next();
                                if (((Annotation) obj2) instanceof Json) {
                                    break;
                                }
                            }
                            Json json2 = (Json) obj2;
                            ArrayList K0 = AbstractC0720ac.K0(interfaceC0596Ww.getAnnotations());
                            if (interfaceC0310Lw != null) {
                                C0362Nw c0362Nw = (C0362Nw) interfaceC0310Lw;
                                AbstractC1048fc.f0(K0, c0362Nw.getAnnotations());
                                if (json2 == null) {
                                    Iterator it4 = c0362Nw.getAnnotations().iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            json = str;
                                            break;
                                        }
                                        json = it4.next();
                                        if (((Annotation) json) instanceof Json) {
                                            break;
                                        }
                                    }
                                    json2 = json;
                                }
                            }
                            Field N = PX.N(interfaceC0596Ww);
                            if (Modifier.isTransient(N != null ? N.getModifiers() : 0)) {
                                if (interfaceC0310Lw != null && !((C0362Nw) interfaceC0310Lw).l()) {
                                    throw new IllegalArgumentException(("No default value for transient constructor " + interfaceC0310Lw).toString());
                                }
                            } else if (json2 == null || !json2.ignore()) {
                                if (interfaceC0310Lw != null) {
                                    C0362Nw c0362Nw2 = (C0362Nw) interfaceC0310Lw;
                                    if (!c0362Nw2.i().equals(interfaceC0596Ww.getReturnType())) {
                                        throw new IllegalArgumentException(("'" + interfaceC0596Ww.getName() + "' has a constructor parameter of type " + c0362Nw2.i() + " but a property of type " + interfaceC0596Ww.getReturnType() + '.').toString());
                                    }
                                }
                                if ((interfaceC0596Ww instanceof InterfaceC2253xw) || interfaceC0310Lw != null) {
                                    if (json2 != null && (name = json2.name()) != null) {
                                        if (name.equals(Json.UNSET_NAME)) {
                                            name = str;
                                        }
                                    }
                                    name = interfaceC0596Ww.getName();
                                    String str2 = name;
                                    InterfaceC1068fw l = ((C1661ox) interfaceC0596Ww.getReturnType()).l();
                                    if (l instanceof InterfaceC0517Tv) {
                                        InterfaceC0517Tv interfaceC0517Tv = (InterfaceC0517Tv) l;
                                        if (interfaceC0517Tv.j()) {
                                            R = AbstractC1473m3.D(interfaceC0517Tv);
                                            if (!((C1661ox) interfaceC0596Ww.getReturnType()).i().isEmpty()) {
                                                List i = ((C1661ox) interfaceC0596Ww.getReturnType()).i();
                                                ArrayList arrayList2 = new ArrayList();
                                                Iterator it5 = i.iterator();
                                                while (it5.hasNext()) {
                                                    InterfaceC1463lx interfaceC1463lx = ((C1990tx) it5.next()).b;
                                                    Type R2 = interfaceC1463lx != null ? PX.R(interfaceC1463lx) : null;
                                                    if (R2 != null) {
                                                        arrayList2.add(R2);
                                                    }
                                                }
                                                Type[] typeArr = (Type[]) arrayList2.toArray(new Type[0]);
                                                R = Types.newParameterizedType(R, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                            }
                                        } else {
                                            R = PX.R(interfaceC0596Ww.getReturnType());
                                        }
                                    } else {
                                        if (!(l instanceof InterfaceC1727px)) {
                                            throw new IllegalStateException("Not possible!");
                                        }
                                        R = PX.R(interfaceC0596Ww.getReturnType());
                                    }
                                    JsonAdapter adapter = moshi.adapter(Util.resolve(type, rawType, R), Util.jsonAnnotations((Annotation[]) K0.toArray(new Annotation[0])), interfaceC0596Ww.getName());
                                    String name2 = interfaceC0596Ww.getName();
                                    AbstractC0048Bt.m(adapter, "adapter");
                                    linkedHashMap2.put(name2, new KotlinJsonAdapter.Binding(str2, adapter, interfaceC0596Ww, interfaceC0310Lw, interfaceC0310Lw != null ? ((C0362Nw) interfaceC0310Lw).i : -1));
                                    str = null;
                                }
                            } else if (interfaceC0310Lw != null && !((C0362Nw) interfaceC0310Lw).l()) {
                                throw new IllegalArgumentException(("No default value for ignored constructor " + interfaceC0310Lw).toString());
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it6 = interfaceC1396kw2.getParameters().iterator();
                        while (it6.hasNext()) {
                            C0362Nw c0362Nw3 = (C0362Nw) ((InterfaceC0310Lw) it6.next());
                            KotlinJsonAdapter.Binding binding = (KotlinJsonAdapter.Binding) AbstractC1305jX.f(linkedHashMap2).remove(c0362Nw3.getName());
                            if (binding == null && !c0362Nw3.l()) {
                                throw new IllegalArgumentException(("No property for required constructor " + c0362Nw3).toString());
                            }
                            arrayList3.add(binding);
                        }
                        int size = arrayList3.size();
                        Iterator it7 = linkedHashMap2.entrySet().iterator();
                        while (true) {
                            int i2 = size;
                            if (!it7.hasNext()) {
                                break;
                            }
                            size = i2 + 1;
                            arrayList3.add(KotlinJsonAdapter.Binding.copy$default((KotlinJsonAdapter.Binding) ((Map.Entry) it7.next()).getValue(), null, null, null, null, i2, 15, null));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it8 = arrayList3.iterator();
                        while (it8.hasNext()) {
                            Object next = it8.next();
                            if (next != null) {
                                arrayList4.add(next);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(AbstractC0786bc.d0(arrayList4));
                        Iterator it9 = arrayList4.iterator();
                        while (it9.hasNext()) {
                            arrayList5.add(((KotlinJsonAdapter.Binding) it9.next()).getJsonName());
                        }
                        String[] strArr = (String[]) arrayList5.toArray(new String[0]);
                        JsonReader.Options of = JsonReader.Options.of((String[]) Arrays.copyOf(strArr, strArr.length));
                        AbstractC0048Bt.m(of, "options");
                        return new KotlinJsonAdapter(interfaceC1396kw2, arrayList3, arrayList4, of).nullSafe();
                    }
                }
            }
        }
        return null;
    }
}
