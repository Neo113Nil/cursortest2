package com.my.tracker.personalize;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class PersonalizeOffer {
    public final int id;

    @NonNull
    public final List<PersonalizeItem> items;

    PersonalizeOffer(int i, ArrayList arrayList) {
        this.id = i;
        this.items = arrayList;
    }
}
