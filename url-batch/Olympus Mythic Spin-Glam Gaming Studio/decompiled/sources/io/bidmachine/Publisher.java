package io.bidmachine;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.Context;
import io.bidmachine.core.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class Publisher {
    private final List<String> categories;
    private final String domain;
    private final String id;
    private final String name;

    public static final class Builder {
        private List<String> categories;
        private String domain;
        private String id;
        private String name;

        public Builder addCategories(@Nullable List<String> list) {
            if (Utils.isEmpty(list)) {
                return this;
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                addCategory(it.next());
            }
            return this;
        }

        public Builder addCategory(@Nullable String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (this.categories == null) {
                this.categories = new ArrayList();
            }
            this.categories.add(str);
            return this;
        }

        public Publisher build() {
            return new Publisher(this.id, this.name, this.domain, this.categories);
        }

        public Builder setDomain(@Nullable String str) {
            this.domain = str;
            return this;
        }

        public Builder setId(@Nullable String str) {
            this.id = str;
            return this;
        }

        public Builder setName(@Nullable String str) {
            this.name = str;
            return this;
        }
    }

    void build(@NonNull Context.App.Builder builder) {
        Context.App.Publisher.Builder newBuilder = Context.App.Publisher.newBuilder();
        String str = this.id;
        if (str != null) {
            newBuilder.setId(str);
        }
        String str2 = this.name;
        if (str2 != null) {
            newBuilder.setName(str2);
        }
        String str3 = this.domain;
        if (str3 != null) {
            newBuilder.setDomain(str3);
        }
        List<String> list = this.categories;
        if (list != null) {
            newBuilder.addAllCat(list);
        }
        builder.setPub(newBuilder.build());
    }

    private Publisher(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list) {
        this.id = str;
        this.name = str2;
        this.domain = str3;
        this.categories = list;
    }
}
