package com.yandex.div.storage.templates;

import androidx.annotation.WorkerThread;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.ogury.core.internal.datastore.preferences.core.PreferencesSerializer;
import com.sglib.easymobile.androidnative.notification.NotificationCategory;
import com.yandex.div.data.DivParsingEnvironment;
import com.yandex.div.json.ParsingErrorLogger;
import com.yandex.div.json.TemplateParsingEnvironment;
import com.yandex.div.json.templates.CachingTemplateProvider;
import com.yandex.div.storage.DivStorage;
import com.yandex.div.storage.DivStorageErrorException;
import com.yandex.div.storage.analytics.ErrorExplanation;
import com.yandex.div.storage.database.StorageException;
import com.yandex.div.storage.histogram.HistogramNameProvider;
import com.yandex.div.storage.histogram.HistogramRecorder;
import com.yandex.div.storage.templates.TemplateHashIds;
import com.yandex.div2.DivTemplate;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: TemplatesContainer.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ(\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010'\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020%H\u0012J$\u0010(\u001a\u0016\u0012\b\u0012\u00060\u0010j\u0002`)\u0012\b\u0012\u00060\u0010j\u0002`*0\u000f2\u0006\u0010$\u001a\u00020%H\u0012J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0010H\u0012J\"\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0010H\u0017J\u0010\u00100\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0012\u00101\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\u0010H\u0012J\b\u00102\u001a\u000203H\u0012J\"\u00104\u001a\b\u0012\u0004\u0012\u00020\u0010052\b\u00106\u001a\u0004\u0018\u00010\u00102\b\u0010&\u001a\u0004\u0018\u00010\u0010H\u0012J\u0012\u00107\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020908H\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00120\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0010X\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00158RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0092\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u001b0\u000fX\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0092\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/yandex/div/storage/templates/TemplatesContainer;", "", "divStorage", "Lcom/yandex/div/storage/DivStorage;", "errorLogger", "Lcom/yandex/div/json/ParsingErrorLogger;", "histogramRecorder", "Lcom/yandex/div/storage/histogram/HistogramRecorder;", "parsingHistogramProxy", "Ljavax/inject/Provider;", "Lcom/yandex/div/storage/templates/DivParsingHistogramProxy;", "histogramNameProvider", "Lcom/yandex/div/storage/histogram/HistogramNameProvider;", "(Lcom/yandex/div/storage/DivStorage;Lcom/yandex/div/json/ParsingErrorLogger;Lcom/yandex/div/storage/histogram/HistogramRecorder;Ljavax/inject/Provider;Lcom/yandex/div/storage/histogram/HistogramNameProvider;)V", "groupTemplateReferences", "", "", "Lcom/yandex/div/storage/templates/GroupId;", "Lcom/yandex/div/storage/templates/TemplateReferenceResolver;", "histogramComponentName", "messageDigest", "Ljava/security/MessageDigest;", "getMessageDigest", "()Ljava/security/MessageDigest;", "messageDigest$delegate", "Lkotlin/Lazy;", "templateEnvironments", "Lcom/yandex/div/data/DivParsingEnvironment;", "templateReferencesLoaded", "", "templatesPool", "Lcom/yandex/div/storage/templates/CommonTemplatesPool;", "addTemplates", "", "Lcom/yandex/div/storage/templates/Template;", NotificationCategory.GROUP_ID_KEY, PreferencesSerializer.fileExtension, "Lorg/json/JSONObject;", "sourceType", "calculateJsonChecksum", "calculateTemplateHashes", "Lcom/yandex/div/storage/templates/TemplateId;", "Lcom/yandex/div/storage/templates/TemplateHash;", "createEnvBy", "explainMissingTemplate", "Lcom/yandex/div/storage/analytics/ErrorExplanation;", "cardId", "templateId", "getEnvironment", "getTemplates", "loadIfNeeded", "", "parsingHistograms", "", "baseName", "loadedTemplatesDetails", "Lcom/yandex/div/json/templates/CachingTemplateProvider;", "Lcom/yandex/div2/DivTemplate;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes15.dex */
public class TemplatesContainer {

    @NotNull
    private final DivStorage divStorage;

    @NotNull
    private final ParsingErrorLogger errorLogger;

    @NotNull
    private final Map<String, TemplateReferenceResolver> groupTemplateReferences;

    @Nullable
    private final String histogramComponentName;

    @Nullable
    private final HistogramNameProvider histogramNameProvider;

    @NotNull
    private final HistogramRecorder histogramRecorder;

    /* renamed from: messageDigest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy messageDigest;

    @NotNull
    private final Provider parsingHistogramProxy;

    @NotNull
    private final Map<String, DivParsingEnvironment> templateEnvironments;
    private boolean templateReferencesLoaded;

    @NotNull
    private final CommonTemplatesPool templatesPool;

    public TemplatesContainer(@NotNull DivStorage divStorage, @NotNull ParsingErrorLogger parsingErrorLogger, @NotNull HistogramRecorder histogramRecorder, @NotNull Provider provider, @Nullable HistogramNameProvider histogramNameProvider) {
        this.divStorage = divStorage;
        this.errorLogger = parsingErrorLogger;
        this.histogramRecorder = histogramRecorder;
        this.parsingHistogramProxy = provider;
        this.histogramNameProvider = histogramNameProvider;
        String componentName = histogramNameProvider != null ? histogramNameProvider.getComponentName() : null;
        this.histogramComponentName = componentName;
        this.templatesPool = new CommonTemplatesPool(divStorage, parsingErrorLogger, componentName, histogramRecorder, provider);
        this.groupTemplateReferences = new LinkedHashMap();
        this.templateEnvironments = new LinkedHashMap();
        this.messageDigest = LazyKt.lazy(new Function0() { // from class: com.yandex.div.storage.templates.TemplatesContainer$messageDigest$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* renamed from: invoke */
            public final MessageDigest mo4828invoke() {
                ParsingErrorLogger parsingErrorLogger2;
                try {
                    return MessageDigest.getInstance(SameMD5.TAG);
                } catch (NoSuchAlgorithmException e) {
                    parsingErrorLogger2 = TemplatesContainer.this.errorLogger;
                    parsingErrorLogger2.logError(new IllegalStateException("Storage cannot work with templates!", e));
                    return null;
                }
            }
        });
    }

    public /* synthetic */ TemplatesContainer(DivStorage divStorage, ParsingErrorLogger parsingErrorLogger, HistogramRecorder histogramRecorder, Provider provider, HistogramNameProvider histogramNameProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(divStorage, parsingErrorLogger, histogramRecorder, provider, (i & 16) != 0 ? null : histogramNameProvider);
    }

    private MessageDigest getMessageDigest() {
        return (MessageDigest) this.messageDigest.getValue();
    }

    @NotNull
    public DivParsingEnvironment getEnvironment(@NotNull String groupId) {
        loadIfNeeded();
        Map<String, DivParsingEnvironment> map = this.templateEnvironments;
        DivParsingEnvironment divParsingEnvironment = map.get(groupId);
        if (divParsingEnvironment == null) {
            divParsingEnvironment = createEnvBy(groupId);
            map.put(groupId, divParsingEnvironment);
        }
        return divParsingEnvironment;
    }

    @WorkerThread
    @NotNull
    public ErrorExplanation explainMissingTemplate(@Nullable String cardId, @NotNull String groupId, @NotNull String templateId) {
        String str;
        String loadedTemplatesDetails;
        TemplateReferenceResolver templateReferenceResolver = this.groupTemplateReferences.get(groupId);
        String resolveTemplateHash = templateReferenceResolver != null ? templateReferenceResolver.resolveTemplateHash(templateId) : null;
        DivParsingEnvironment divParsingEnvironment = this.templateEnvironments.get(groupId);
        CachingTemplateProvider<DivTemplate> templates = divParsingEnvironment != null ? divParsingEnvironment.getTemplates() : null;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if ((templates != null ? templates.get(templateId) : null) != null) {
            str = "unknown, template is loaded";
        } else if (!explainMissingTemplate$templateStored(resolveTemplateHash, this, arrayList)) {
            sb.append("supported responses: " + CollectionsKt.joinToString$default(this.groupTemplateReferences.keySet(), null, null, null, 0, null, null, 63, null));
            if (!this.groupTemplateReferences.keySet().contains(groupId)) {
                str = "cached, but not loaded into memory";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(' ');
                sb2.append(templates != null ? loadedTemplatesDetails(templates) : null);
                sb.append(sb2.toString());
                str = "cached, but loaded partially";
            }
        } else if (!explainMissingTemplate$cardStored(cardId, this, groupId, arrayList)) {
            str = "access templates ahead of time";
        } else {
            if (arrayList.isEmpty()) {
                str = "not present in original response";
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(((DivStorageErrorException) it.next()).getMessage() + ";\n");
                }
                str = "fatal exception when explaining reason";
            }
            if (templates != null && (loadedTemplatesDetails = loadedTemplatesDetails(templates)) != null) {
                sb.append(loadedTemplatesDetails);
            }
        }
        return new ErrorExplanation(str, sb.toString());
    }

    private static final boolean explainMissingTemplate$cardStored(String str, TemplatesContainer templatesContainer, String str2, List<DivStorageErrorException> list) {
        if (str == null) {
            return false;
        }
        try {
            return templatesContainer.divStorage.isCardExists(str, str2);
        } catch (DivStorageErrorException e) {
            list.add(e);
            return false;
        }
    }

    private static final boolean explainMissingTemplate$templateStored(String str, TemplatesContainer templatesContainer, List<DivStorageErrorException> list) {
        if (str == null) {
            return false;
        }
        try {
            return templatesContainer.divStorage.isTemplateExists(str);
        } catch (DivStorageErrorException e) {
            list.add(e);
            return false;
        }
    }

    @NotNull
    public List<Template> addTemplates(@NotNull String groupId, @NotNull JSONObject json, @Nullable String sourceType) {
        TemplateParsingEnvironment.TemplateParsingResult<DivTemplate> parseTemplatesWithResultsAndDependencies;
        HistogramNameProvider histogramNameProvider = this.histogramNameProvider;
        String divParsingHistogramName = histogramNameProvider != null ? histogramNameProvider.getDivParsingHistogramName() : null;
        Map<String, String> calculateTemplateHashes = calculateTemplateHashes(json);
        DivParsingEnvironment environment = getEnvironment(groupId);
        if (divParsingHistogramName != null) {
            Set<String> parsingHistograms = parsingHistograms(divParsingHistogramName, sourceType);
            long currentTimeMillis = System.currentTimeMillis();
            parseTemplatesWithResultsAndDependencies = ((DivParsingHistogramProxy) this.parsingHistogramProxy.get()).parseTemplatesWithResultsAndDependencies(environment, json, this.histogramComponentName);
            this.histogramRecorder.reportTemplatesParseTime(parsingHistograms, System.currentTimeMillis() - currentTimeMillis);
        } else {
            parseTemplatesWithResultsAndDependencies = ((DivParsingHistogramProxy) this.parsingHistogramProxy.get()).parseTemplatesWithResultsAndDependencies(environment, json, this.histogramComponentName);
        }
        environment.getTemplates().putAll(parseTemplatesWithResultsAndDependencies.getParsedTemplates());
        ArrayList arrayList = new ArrayList(parseTemplatesWithResultsAndDependencies.getParsedTemplates().size());
        for (Map.Entry<String, DivTemplate> entry : parseTemplatesWithResultsAndDependencies.getParsedTemplates().entrySet()) {
            String key = entry.getKey();
            DivTemplate value = entry.getValue();
            String str = calculateTemplateHashes.get(key);
            if (str == null) {
                this.errorLogger.logError(new IllegalStateException("No corresponding template was found for templateId = " + key));
            } else {
                this.templatesPool.put(str, value);
                JSONObject optJSONObject = json.optJSONObject(key);
                if (optJSONObject != null) {
                    arrayList.add(new Template(key, str, optJSONObject));
                } else {
                    this.errorLogger.logError(new IllegalStateException("No raw template found for templateId = " + key));
                }
            }
        }
        this.templateEnvironments.put(groupId, environment);
        this.groupTemplateReferences.put(groupId, new TemplateReferenceResolver(this.errorLogger));
        return arrayList;
    }

    private String loadedTemplatesDetails(CachingTemplateProvider<DivTemplate> cachingTemplateProvider) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        cachingTemplateProvider.takeSnapshot(linkedHashMap);
        return "in-memory templates count: " + linkedHashMap.size();
    }

    private Set<String> parsingHistograms(String baseName, String sourceType) {
        if (baseName != null) {
            LinkedHashSet linkedSetOf = SetsKt.linkedSetOf(baseName);
            if (sourceType == null) {
                return linkedSetOf;
            }
            linkedSetOf.add(baseName + '.' + sourceType);
            return linkedSetOf;
        }
        return SetsKt.emptySet();
    }

    private void loadIfNeeded() {
        if (this.templateReferencesLoaded) {
            return;
        }
        this.templateReferencesLoaded = true;
        DivStorage.LoadDataResult<DivStorage.TemplateReference> readTemplateReferences = this.divStorage.readTemplateReferences();
        Iterator<T> it = readTemplateReferences.getErrors().iterator();
        while (it.hasNext()) {
            this.errorLogger.logError((StorageException) it.next());
        }
        for (DivStorage.TemplateReference templateReference : readTemplateReferences.getRestoredData()) {
            Map<String, TemplateReferenceResolver> map = this.groupTemplateReferences;
            String groupId = templateReference.getGroupId();
            TemplateReferenceResolver templateReferenceResolver = map.get(groupId);
            if (templateReferenceResolver == null) {
                templateReferenceResolver = new TemplateReferenceResolver(this.errorLogger);
                map.put(groupId, templateReferenceResolver);
            }
            templateReferenceResolver.add(templateReference);
        }
    }

    private DivParsingEnvironment createEnvBy(String groupId) {
        DivParsingEnvironment createEmptyEnv;
        DivParsingEnvironment createEmptyEnv2;
        TemplateReferenceResolver templates = getTemplates(groupId);
        if (templates == null) {
            createEmptyEnv2 = TemplatesContainerKt.createEmptyEnv(this.errorLogger);
            return createEmptyEnv2;
        }
        Map<String, DivTemplate> load = this.templatesPool.load(templates);
        createEmptyEnv = TemplatesContainerKt.createEmptyEnv(this.errorLogger);
        HashMap hashMap = new HashMap(load.size());
        for (Map.Entry<String, DivTemplate> entry : load.entrySet()) {
            String key = entry.getKey();
            DivTemplate value = entry.getValue();
            TemplateHashIds templateHashIds = (TemplateHashIds) templates.getTemplateIdRefs().get(key);
            if (!(templateHashIds instanceof TemplateHashIds.Collection)) {
                if (templateHashIds instanceof TemplateHashIds.Single) {
                    hashMap.put(((TemplateHashIds.Single) templateHashIds).m7373unboximpl(), value);
                } else if (templateHashIds == null) {
                    templates.logger.logError(new IllegalStateException("No template id was found for hash!"));
                }
            } else {
                Iterator it = ((TemplateHashIds.Collection) templateHashIds).getIds().iterator();
                while (it.hasNext()) {
                    hashMap.put((String) it.next(), value);
                }
            }
        }
        createEmptyEnv.getTemplates().putAll(hashMap);
        return createEmptyEnv;
    }

    private TemplateReferenceResolver getTemplates(String groupId) {
        loadIfNeeded();
        return this.groupTemplateReferences.get(groupId);
    }

    private Map<String, String> calculateTemplateHashes(JSONObject json) {
        String calculateJsonChecksum;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = json.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = json.get(next);
            if ((obj instanceof JSONObject) && (calculateJsonChecksum = calculateJsonChecksum((JSONObject) obj)) != null) {
                linkedHashMap.put(next, calculateJsonChecksum);
            }
        }
        return linkedHashMap;
    }

    private String calculateJsonChecksum(JSONObject json) {
        byte[] digest;
        byte[] bytes = json.toString().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        synchronized (this) {
            MessageDigest messageDigest = getMessageDigest();
            digest = messageDigest != null ? messageDigest.digest(bytes) : null;
        }
        if (digest == null) {
            return null;
        }
        return StringsKt.padStart(new BigInteger(1, digest).toString(16), 32, '0');
    }
}
