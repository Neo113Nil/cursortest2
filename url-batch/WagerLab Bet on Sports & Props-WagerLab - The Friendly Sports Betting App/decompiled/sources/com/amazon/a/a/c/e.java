package com.amazon.a.a.c;

import com.amazon.a.a.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: EventListenerNotificationQueue.java */
/* loaded from: classes3.dex */
public class e<EventType extends a> implements Comparator<c<EventType>> {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f510a = new com.amazon.a.a.o.c("EventListenerNotificationQueue");
    private List<c<EventType>> b = new ArrayList();

    public void a(c<EventType> cVar) {
        if (com.amazon.a.a.o.c.f599a) {
            f510a.a("Adding listener: " + cVar);
        }
        this.b.add(cVar);
        Collections.sort(this.b, this);
    }

    public void a(EventType eventtype) {
        for (c<EventType> cVar : this.b) {
            if (com.amazon.a.a.o.c.f599a) {
                f510a.a("Notifying listener: " + cVar);
            }
            cVar.a(eventtype);
        }
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(c<EventType> cVar, c<EventType> cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }
}
