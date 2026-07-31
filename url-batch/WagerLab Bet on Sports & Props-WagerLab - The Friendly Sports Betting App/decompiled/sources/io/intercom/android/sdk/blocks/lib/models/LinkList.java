package io.intercom.android.sdk.blocks.lib.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.lib.models.Link;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public class LinkList implements Parcelable {
    public static final Parcelable.Creator<LinkList> CREATOR = new Parcelable.Creator<LinkList>() { // from class: io.intercom.android.sdk.blocks.lib.models.LinkList.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkList createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Link.class.getClassLoader());
            return new LinkList(arrayList, (Link) parcel.readParcelable(Link.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LinkList[] newArray(int i) {
            return new LinkList[i];
        }
    };
    private final Link footerLink;
    private final List<Link> links;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LinkList(List<Link> list, Link link) {
        this.links = list;
        this.footerLink = link;
    }

    public static LinkList fromBlock(Block block) {
        if (block == null) {
            return new LinkList(Collections.emptyList(), new Link.Builder().build());
        }
        return new LinkList(block.getLinks(), block.getFooterLink());
    }

    public List<Link> getLinks() {
        return this.links;
    }

    public Link getFooterLink() {
        return this.footerLink;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LinkList linkList = (LinkList) obj;
        if (this.links.equals(linkList.links)) {
            return this.footerLink.equals(linkList.footerLink);
        }
        return false;
    }

    public int hashCode() {
        return (this.links.hashCode() * 31) + this.footerLink.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.links);
        parcel.writeParcelable(this.footerLink, i);
    }
}
