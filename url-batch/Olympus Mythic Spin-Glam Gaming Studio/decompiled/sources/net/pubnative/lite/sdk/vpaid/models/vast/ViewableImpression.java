package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Attribute;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes4.dex */
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
