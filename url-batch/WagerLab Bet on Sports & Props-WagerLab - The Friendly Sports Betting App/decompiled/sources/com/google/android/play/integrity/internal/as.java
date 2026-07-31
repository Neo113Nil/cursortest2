package com.google.android.play.integrity.internal;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.play:integrity@@1.4.0 */
/* loaded from: classes4.dex */
public abstract class as extends ao implements Set {

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    private transient ar f777a;

    as() {
    }

    public static as h() {
        return au.f779a;
    }

    @Override // com.google.android.play.integrity.internal.ao, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: d */
    public abstract av iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof as) {
            ((as) obj).i();
            if (obj.hashCode() != 0) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final ar f() {
        ar arVar = this.f777a;
        if (arVar != null) {
            return arVar;
        }
        ar g = g();
        this.f777a = g;
        return g;
    }

    ar g() {
        throw null;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    boolean i() {
        throw null;
    }
}
