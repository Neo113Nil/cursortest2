package com.my.target.common.menu;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes5.dex */
public final class MenuAction {

    @Nullable
    public final String alias;
    public final int style;

    @NonNull
    public final String title;

    @NonNull
    public final String type;

    public MenuAction(@NonNull String str, int i, @NonNull String str2, @Nullable String str3) {
        this.title = str;
        this.style = i;
        this.type = str2;
        this.alias = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MenuAction)) {
            return false;
        }
        MenuAction menuAction = (MenuAction) obj;
        return this.style == menuAction.style && this.title.equals(menuAction.title) && this.type.equals(menuAction.type) && Objects.equals(this.alias, menuAction.alias);
    }

    public int hashCode() {
        return Objects.hash(this.title, this.type, this.alias, Integer.valueOf(this.style));
    }
}
