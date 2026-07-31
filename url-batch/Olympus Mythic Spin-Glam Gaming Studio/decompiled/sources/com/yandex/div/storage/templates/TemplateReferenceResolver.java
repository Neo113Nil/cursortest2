package com.yandex.div.storage.templates;

import com.safedk.android.analytics.brandsafety.m;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.templates.TemplateHashIds;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TemplatesContainer.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\rH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R(\u0010\u0018\u001a\u0016\u0012\b\u0012\u00060\u000bj\u0002`\u0016\u0012\b\u0012\u00060\u000bj\u0002`\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR!\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\u00170\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010 R+\u0010'\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\u0017\u0012\u0004\u0012\u00020\"0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/yandex/div/storage/templates/TemplateReferenceResolver;", "", "Lcom/yandex/div/json/ParsingErrorLogger;", "logger", "<init>", "(Lcom/yandex/div/json/ParsingErrorLogger;)V", "Lcom/yandex/div/storage/DivStorage$TemplateReference;", "templateReference", "", m.l, "(Lcom/yandex/div/storage/DivStorage$TemplateReference;)V", "", "hash", "Lkotlin/Function1;", "block", "doOnEachResolvedId", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "id", "resolveTemplateHash", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/yandex/div/json/ParsingErrorLogger;", "", "Lcom/yandex/div/storage/templates/TemplateId;", "Lcom/yandex/div/storage/templates/TemplateHash;", "templateHashRefs", "Ljava/util/Map;", "", "_templateHashes", "Ljava/util/Set;", "", "templateHashes", "getTemplateHashes", "()Ljava/util/Set;", "", "Lcom/yandex/div/storage/templates/TemplateHashIds;", "templateIdRefs$delegate", "Lkotlin/Lazy;", "getTemplateIdRefs", "()Ljava/util/Map;", "templateIdRefs", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
final class TemplateReferenceResolver {

    @NotNull
    private final Set<String> _templateHashes;

    @NotNull
    private final ParsingErrorLogger logger;

    @NotNull
    private final Map<String, String> templateHashRefs = new LinkedHashMap();

    @NotNull
    private final Set<String> templateHashes;

    /* renamed from: templateIdRefs$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy templateIdRefs;

    public TemplateReferenceResolver(@NotNull ParsingErrorLogger parsingErrorLogger) {
        this.logger = parsingErrorLogger;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this._templateHashes = linkedHashSet;
        this.templateHashes = linkedHashSet;
        this.templateIdRefs = LazyKt.lazy(new Function0() { // from class: com.yandex.div.storage.templates.TemplateReferenceResolver$templateIdRefs$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final HashMap<String, TemplateHashIds> mo4828invoke() {
                Map map;
                Map map2;
                map = TemplateReferenceResolver.this.templateHashRefs;
                HashMap<String, TemplateHashIds> hashMap = new HashMap<>(map.size());
                map2 = TemplateReferenceResolver.this.templateHashRefs;
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    TemplateHashIds templateHashIds = hashMap.get(str2);
                    if (templateHashIds == null) {
                        templateHashIds = TemplateHashIds.Single.m7367boximpl(TemplateHashIds.Single.m7368constructorimpl(str));
                    } else if (templateHashIds instanceof TemplateHashIds.Single) {
                        templateHashIds = TemplateHashIds.Collection.m7360boximpl(TemplateHashIds.Collection.m7361constructorimpl(CollectionsKt.mutableListOf(((TemplateHashIds.Single) templateHashIds).m7373unboximpl(), str)));
                    } else if (templateHashIds instanceof TemplateHashIds.Collection) {
                        ((TemplateHashIds.Collection) templateHashIds).getIds().add(str);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    hashMap.put(str2, templateHashIds);
                }
                return hashMap;
            }
        });
    }

    @NotNull
    public final Set<String> getTemplateHashes() {
        return this.templateHashes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, TemplateHashIds> getTemplateIdRefs() {
        return (Map) this.templateIdRefs.getValue();
    }

    public final void add(@NotNull DivStorage.TemplateReference templateReference) {
        this.templateHashRefs.put(templateReference.getTemplateId(), templateReference.getTemplateHash());
        this._templateHashes.add(templateReference.getTemplateHash());
    }

    public final void doOnEachResolvedId(@NotNull String hash, @NotNull Function1 block) {
        TemplateHashIds templateHashIds = (TemplateHashIds) getTemplateIdRefs().get(hash);
        if (!(templateHashIds instanceof TemplateHashIds.Collection)) {
            if (templateHashIds instanceof TemplateHashIds.Single) {
                block.invoke(((TemplateHashIds.Single) templateHashIds).m7373unboximpl());
                return;
            } else {
                if (templateHashIds == null) {
                    this.logger.logError(new IllegalStateException("No template id was found for hash!"));
                    return;
                }
                return;
            }
        }
        Iterator it = ((TemplateHashIds.Collection) templateHashIds).getIds().iterator();
        while (it.hasNext()) {
            block.invoke((String) it.next());
        }
    }

    @Nullable
    public final String resolveTemplateHash(@NotNull String id) {
        return this.templateHashRefs.get(id);
    }
}
