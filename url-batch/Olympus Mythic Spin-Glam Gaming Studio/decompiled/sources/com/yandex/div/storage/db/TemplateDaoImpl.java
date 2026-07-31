package com.yandex.div.storage.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.entity.Template;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TemplateDaoImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0014\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u0013*\u00020\u0015H\u0002J\u0014\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\r0\r*\u00020\u0015H\u0002J\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/yandex/div/storage/db/TemplateDaoImpl;", "Lcom/yandex/div/storage/db/TemplateDao;", "writableDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "(Landroid/database/sqlite/SQLiteDatabase;)V", "deleteAllTemplates", "", "deleteUnusedTemplates", "getAllTemplates", "", "Lcom/yandex/div/storage/entity/Template;", "getTemplates", "cardId", "", "getTemplatesByIds", "templateIds", "insertTemplate", "template", "getData", "", "kotlin.jvm.PlatformType", "Landroid/database/Cursor;", "getId", "retrieveTemplates", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TemplateDaoImpl implements TemplateDao {

    @NotNull
    private final SQLiteDatabase writableDatabase;

    public TemplateDaoImpl(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.writableDatabase = sQLiteDatabase;
        if (sQLiteDatabase.isReadOnly()) {
            Assert.fail(TemplateDaoImpl.class.getName() + " requires writable db!");
        }
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    @NotNull
    public List<Template> getAllTemplates() {
        Cursor rawQuery = this.writableDatabase.rawQuery(TemplateQueries.GET_ALL_TEMPLATES_QUERY, new String[0]);
        List<Template> retrieveTemplates = retrieveTemplates(rawQuery);
        rawQuery.close();
        return retrieveTemplates;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    @NotNull
    public List<Template> getTemplates(@NotNull String cardId) {
        Cursor rawQuery = this.writableDatabase.rawQuery(TemplateQueries.GET_TEMPLATES_BY_CARD_ID_QUERY_TEMPLATE, new String[]{cardId});
        List<Template> retrieveTemplates = retrieveTemplates(rawQuery);
        rawQuery.close();
        return retrieveTemplates;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    @NotNull
    public List<Template> getTemplatesByIds(@NotNull List<String> templateIds) {
        Cursor rawQuery = this.writableDatabase.rawQuery(DBKt.appendPlaceholders(new StringBuilder(TemplateQueries.GET_TEMPLATES_BY_IDS_QUERY_TEMPLATE_WITHOUT_PLACEHOLDER), templateIds.size()).toString(), (String[]) templateIds.toArray(new String[0]));
        List<Template> retrieveTemplates = retrieveTemplates(rawQuery);
        rawQuery.close();
        return retrieveTemplates;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    public void insertTemplate(@NotNull Template template) {
        this.writableDatabase.execSQL(TemplateQueries.INSERT_TEMPLATE_QUERY_TEMPLATE, new Serializable[]{template.getId(), template.getData()});
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    public void deleteAllTemplates() {
        this.writableDatabase.execSQL("DELETE FROM templates");
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    public void deleteUnusedTemplates() {
        this.writableDatabase.execSQL(TemplateQueries.DELETE_UNUSED_TEMPLATES_QUERY_TEMPLATE);
    }

    private final String getId(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("template_id"));
    }

    private final byte[] getData(Cursor cursor) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow("template_data"));
    }

    private final List<Template> retrieveTemplates(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(new Template(getId(cursor), getData(cursor)));
        }
        return arrayList;
    }
}
