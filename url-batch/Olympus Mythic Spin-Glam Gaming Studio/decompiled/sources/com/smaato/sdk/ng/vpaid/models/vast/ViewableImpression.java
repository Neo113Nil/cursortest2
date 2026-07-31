package com.smaato.sdk.ng.vpaid.models.vast;

import com.smaato.sdk.ng.vpaid.xml.Attribute;
import com.smaato.sdk.ng.vpaid.xml.Tag;
import java.util.List;

/* loaded from: classes14.dex */
public class ViewableImpression {

    @Attribute
    private String id;

    @Tag("NotViewable")
    private List<NotViewable> notViewableList;

    @Tag("ViewUndetermined")
    private List<ViewUndetermined> viewUndeterminedList;

    @Tag("Viewable")
    private List<Viewable> viewableList;

    public String getId() {
        return this.id;
    }

    public List<NotViewable> getNotViewableList() {
        return this.notViewableList;
    }

    public List<ViewUndetermined> getViewUndeterminedList() {
        return this.viewUndeterminedList;
    }

    public List<Viewable> getViewableList() {
        return this.viewableList;
    }
}
