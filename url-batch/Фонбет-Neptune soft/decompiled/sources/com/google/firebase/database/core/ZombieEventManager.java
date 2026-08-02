package com.google.firebase.database.core;

import com.google.firebase.database.core.utilities.Utilities;
import com.google.firebase.database.core.view.QuerySpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class ZombieEventManager implements EventRegistrationZombieListener {
    private static ZombieEventManager defaultInstance = new ZombieEventManager();
    final HashMap<EventRegistration, List<EventRegistration>> globalEventRegistrations = new HashMap<>();

    private ZombieEventManager() {
    }

    public static ZombieEventManager getInstance() {
        return defaultInstance;
    }

    public void recordEventRegistration(EventRegistration eventRegistration) {
        synchronized (this.globalEventRegistrations) {
            List<EventRegistration> list = this.globalEventRegistrations.get(eventRegistration);
            if (list == null) {
                list = new ArrayList<>();
                this.globalEventRegistrations.put(eventRegistration, list);
            }
            list.add(eventRegistration);
            if (!eventRegistration.getQuerySpec().isDefault()) {
                EventRegistration clone = eventRegistration.clone(QuerySpec.defaultQueryAtPath(eventRegistration.getQuerySpec().getPath()));
                List<EventRegistration> list2 = this.globalEventRegistrations.get(clone);
                if (list2 == null) {
                    list2 = new ArrayList<>();
                    this.globalEventRegistrations.put(clone, list2);
                }
                list2.add(eventRegistration);
            }
            eventRegistration.setIsUserInitiated(true);
            eventRegistration.setOnZombied(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (r4 == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void unRecordEventRegistration(EventRegistration eventRegistration) {
        EventRegistration clone;
        List<EventRegistration> list;
        boolean z;
        synchronized (this.globalEventRegistrations) {
            List<EventRegistration> list2 = this.globalEventRegistrations.get(eventRegistration);
            boolean z2 = true;
            int i = 0;
            if (list2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list2.size()) {
                        z = false;
                        break;
                    } else {
                        if (list2.get(i2) == eventRegistration) {
                            list2.remove(i2);
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (list2.isEmpty()) {
                    this.globalEventRegistrations.remove(eventRegistration);
                }
            }
            if (eventRegistration.isUserInitiated()) {
                z2 = false;
            }
            Utilities.hardAssert(z2);
            if (!eventRegistration.getQuerySpec().isDefault() && (list = this.globalEventRegistrations.get((clone = eventRegistration.clone(QuerySpec.defaultQueryAtPath(eventRegistration.getQuerySpec().getPath()))))) != null) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (list.get(i) == eventRegistration) {
                        list.remove(i);
                        break;
                    }
                    i++;
                }
                if (list.isEmpty()) {
                    this.globalEventRegistrations.remove(clone);
                }
            }
        }
    }

    public void zombifyForRemove(EventRegistration eventRegistration) {
        synchronized (this.globalEventRegistrations) {
            List<EventRegistration> list = this.globalEventRegistrations.get(eventRegistration);
            if (list != null && !list.isEmpty()) {
                if (eventRegistration.getQuerySpec().isDefault()) {
                    HashSet hashSet = new HashSet();
                    for (int size = list.size() - 1; size >= 0; size--) {
                        EventRegistration eventRegistration2 = list.get(size);
                        if (!hashSet.contains(eventRegistration2.getQuerySpec())) {
                            hashSet.add(eventRegistration2.getQuerySpec());
                            eventRegistration2.zombify();
                        }
                    }
                } else {
                    list.get(0).zombify();
                }
            }
        }
    }

    @Override // com.google.firebase.database.core.EventRegistrationZombieListener
    public void onZombied(EventRegistration eventRegistration) {
        unRecordEventRegistration(eventRegistration);
    }
}
