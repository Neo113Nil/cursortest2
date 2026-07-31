package androidx.work.impl.model;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes3.dex */
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {
    private final RoomDatabase __db;

    public RawWorkInfoDao_Impl(RoomDatabase __db) {
        this.__db = __db;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x020f A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f8 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d4 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c6 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a6 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0198 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018d A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017e A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016a A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x013e A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x012d A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028d A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a0 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025d A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x024f A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0226 A[Catch: all -> 0x02c1, TryCatch #0 {all -> 0x02c1, blocks: (B:3:0x0011, B:4:0x00be, B:6:0x00c4, B:8:0x00d2, B:9:0x00df, B:11:0x00eb, B:17:0x00f8, B:18:0x010f, B:77:0x027c, B:79:0x028d, B:80:0x0292, B:82:0x02a0, B:83:0x02a5, B:85:0x0267, B:88:0x0274, B:89:0x0270, B:90:0x025d, B:91:0x024f, B:92:0x023d, B:95:0x0226, B:100:0x020f, B:105:0x01f8, B:110:0x01e2, B:111:0x01d4, B:112:0x01c6, B:113:0x01b6, B:114:0x01a6, B:115:0x0198, B:116:0x018d, B:117:0x017e, B:118:0x0175, B:119:0x016a, B:120:0x0161, B:121:0x0158, B:122:0x013e, B:125:0x014a, B:126:0x0146, B:127:0x012d, B:128:0x011b, B:131:0x0122), top: B:2:0x0011 }] */
    @Override // androidx.work.impl.model.RawWorkInfoDao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(final SupportSQLiteQuery query) {
        String string;
        WorkInfo.State intToState;
        Data fromByteArray;
        boolean z;
        BackoffPolicy intToBackoffPolicy;
        int i;
        NetworkType intToNetworkType;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
        ArrayList<String> arrayList;
        ArrayList<Data> arrayList2;
        int i7;
        this.__db.assertNotSuspendingTransaction();
        Cursor query2 = DBUtil.query(this.__db, query, true, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query2, "id");
            int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
            int columnIndex3 = CursorUtil.getColumnIndex(query2, "output");
            int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
            int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
            int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
            int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
            int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
            int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
            int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
            int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
            int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
            int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
            int columnIndex14 = CursorUtil.getColumnIndex(query2, DownloadService.KEY_STOP_REASON);
            int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
            int columnIndex16 = CursorUtil.getColumnIndex(query2, "requires_charging");
            int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
            int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
            int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
            int columnIndex20 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
            int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
            int columnIndex22 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
            HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
            int i8 = columnIndex13;
            HashMap<String, ArrayList<Data>> hashMap2 = new HashMap<>();
            while (query2.moveToNext()) {
                int i9 = columnIndex12;
                String string2 = query2.getString(columnIndex);
                if (hashMap.get(string2) == null) {
                    i7 = columnIndex11;
                    hashMap.put(string2, new ArrayList<>());
                } else {
                    i7 = columnIndex11;
                }
                String string3 = query2.getString(columnIndex);
                if (hashMap2.get(string3) == null) {
                    hashMap2.put(string3, new ArrayList<>());
                }
                columnIndex12 = i9;
                columnIndex11 = i7;
            }
            int i10 = columnIndex11;
            int i11 = columnIndex12;
            query2.moveToPosition(-1);
            __fetchRelationshipWorkTagAsjavaLangString(hashMap);
            __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
            ArrayList arrayList3 = new ArrayList(query2.getCount());
            while (query2.moveToNext()) {
                if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                    string = query2.getString(columnIndex);
                    if (columnIndex2 != -1) {
                        intToState = null;
                    } else {
                        int i12 = query2.getInt(columnIndex2);
                        WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                        intToState = WorkTypeConverters.intToState(i12);
                    }
                    if (columnIndex3 != -1) {
                        fromByteArray = null;
                    } else {
                        fromByteArray = Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                    }
                    long j = columnIndex4 != -1 ? 0L : query2.getLong(columnIndex4);
                    long j2 = columnIndex5 != -1 ? 0L : query2.getLong(columnIndex5);
                    long j3 = columnIndex6 != -1 ? 0L : query2.getLong(columnIndex6);
                    z = false;
                    int i13 = columnIndex7 != -1 ? 0 : query2.getInt(columnIndex7);
                    if (columnIndex8 != -1) {
                        intToBackoffPolicy = null;
                    } else {
                        int i14 = query2.getInt(columnIndex8);
                        WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                        intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i14);
                    }
                    long j4 = columnIndex9 != -1 ? 0L : query2.getLong(columnIndex9);
                    long j5 = columnIndex10 != -1 ? 0L : query2.getLong(columnIndex10);
                    int i15 = i10;
                    int i16 = i15 != -1 ? 0 : query2.getInt(i15);
                    i10 = i15;
                    int i17 = i11;
                    int i18 = i17 != -1 ? 0 : query2.getInt(i17);
                    i11 = i17;
                    int i19 = i8;
                    long j6 = i19 != -1 ? 0L : query2.getLong(i19);
                    i8 = i19;
                    int i20 = columnIndex14;
                    int i21 = i20 != -1 ? 0 : query2.getInt(i20);
                    columnIndex14 = i20;
                    i = columnIndex15;
                    if (i != -1) {
                        intToNetworkType = null;
                    } else {
                        int i22 = query2.getInt(i);
                        WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                        intToNetworkType = WorkTypeConverters.intToNetworkType(i22);
                    }
                    columnIndex15 = i;
                    i2 = columnIndex16;
                    if (i2 != -1) {
                        z2 = false;
                    } else {
                        z2 = query2.getInt(i2) != 0;
                    }
                    columnIndex16 = i2;
                    i3 = columnIndex17;
                    if (i3 != -1) {
                        z3 = false;
                    } else {
                        z3 = query2.getInt(i3) != 0;
                    }
                    columnIndex17 = i3;
                    i4 = columnIndex18;
                    if (i4 != -1) {
                        z4 = false;
                    } else {
                        z4 = query2.getInt(i4) != 0;
                    }
                    columnIndex18 = i4;
                    i5 = columnIndex19;
                    if (i5 != -1 && query2.getInt(i5) != 0) {
                        z = true;
                    }
                    columnIndex19 = i5;
                    int i23 = columnIndex20;
                    boolean z5 = z;
                    long j7 = i23 != -1 ? 0L : query2.getLong(i23);
                    columnIndex20 = i23;
                    int i24 = columnIndex21;
                    long j8 = i24 != -1 ? query2.getLong(i24) : 0L;
                    columnIndex21 = i24;
                    i6 = columnIndex22;
                    long j9 = j8;
                    if (i6 != -1) {
                        byteArrayToSetOfTriggers = null;
                    } else {
                        byte[] blob = query2.isNull(i6) ? null : query2.getBlob(i6);
                        WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                        byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob);
                    }
                    Constraints constraints = new Constraints(intToNetworkType, z2, z3, z4, z5, j7, j9, byteArrayToSetOfTriggers);
                    arrayList = hashMap.get(query2.getString(columnIndex));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList2 = hashMap2.get(query2.getString(columnIndex));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                    columnIndex22 = i6;
                }
                string = null;
                if (columnIndex2 != -1) {
                }
                if (columnIndex3 != -1) {
                }
                if (columnIndex4 != -1) {
                }
                if (columnIndex5 != -1) {
                }
                if (columnIndex6 != -1) {
                }
                z = false;
                if (columnIndex7 != -1) {
                }
                if (columnIndex8 != -1) {
                }
                if (columnIndex9 != -1) {
                }
                if (columnIndex10 != -1) {
                }
                int i152 = i10;
                if (i152 != -1) {
                }
                i10 = i152;
                int i172 = i11;
                if (i172 != -1) {
                }
                i11 = i172;
                int i192 = i8;
                if (i192 != -1) {
                }
                i8 = i192;
                int i202 = columnIndex14;
                if (i202 != -1) {
                }
                columnIndex14 = i202;
                i = columnIndex15;
                if (i != -1) {
                }
                columnIndex15 = i;
                i2 = columnIndex16;
                if (i2 != -1) {
                }
                columnIndex16 = i2;
                i3 = columnIndex17;
                if (i3 != -1) {
                }
                columnIndex17 = i3;
                i4 = columnIndex18;
                if (i4 != -1) {
                }
                columnIndex18 = i4;
                i5 = columnIndex19;
                if (i5 != -1) {
                    z = true;
                }
                columnIndex19 = i5;
                int i232 = columnIndex20;
                boolean z52 = z;
                if (i232 != -1) {
                }
                columnIndex20 = i232;
                int i242 = columnIndex21;
                if (i242 != -1) {
                }
                columnIndex21 = i242;
                i6 = columnIndex22;
                long j92 = j8;
                if (i6 != -1) {
                }
                Constraints constraints2 = new Constraints(intToNetworkType, z2, z3, z4, z52, j7, j92, byteArrayToSetOfTriggers);
                arrayList = hashMap.get(query2.getString(columnIndex));
                if (arrayList == null) {
                }
                arrayList2 = hashMap2.get(query2.getString(columnIndex));
                if (arrayList2 == null) {
                }
                arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints2, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                columnIndex22 = i6;
            }
            return arrayList3;
        } finally {
            query2.close();
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(final SupportSQLiteQuery query) {
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.1
            /* JADX WARN: Removed duplicated region for block: B:100:0x0214 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x01fd A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x01e7 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:111:0x01d7 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01c9 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x01b9 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x01a9 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x019b A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0190 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0181 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0178 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x016d A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0164 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x015b A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x0141 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0130 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0224  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x024d  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0292 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x02a5 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x026c A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0262 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0254 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x022b A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                String string;
                WorkInfo.State intToState;
                Data fromByteArray;
                boolean z;
                BackoffPolicy intToBackoffPolicy;
                int i;
                NetworkType intToNetworkType;
                int i2;
                boolean z2;
                int i3;
                boolean z3;
                int i4;
                boolean z4;
                int i5;
                int i6;
                Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
                ArrayList arrayList;
                ArrayList arrayList2;
                int i7;
                Cursor query2 = DBUtil.query(RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query2, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query2, DownloadService.KEY_STOP_REASON);
                    int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query2, "requires_charging");
                    int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
                    int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
                    int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
                    int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i8 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query2.moveToNext()) {
                        int i9 = columnIndex12;
                        String string2 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap.get(string2)) == null) {
                            i7 = columnIndex11;
                            hashMap.put(string2, new ArrayList());
                        } else {
                            i7 = columnIndex11;
                        }
                        String string3 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap2.get(string3)) == null) {
                            hashMap2.put(string3, new ArrayList());
                        }
                        columnIndex12 = i9;
                        columnIndex11 = i7;
                    }
                    int i10 = columnIndex11;
                    int i11 = columnIndex12;
                    query2.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList3 = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                            string = query2.getString(columnIndex);
                            if (columnIndex2 != -1) {
                                intToState = null;
                            } else {
                                int i12 = query2.getInt(columnIndex2);
                                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                                intToState = WorkTypeConverters.intToState(i12);
                            }
                            if (columnIndex3 != -1) {
                                fromByteArray = null;
                            } else {
                                fromByteArray = Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                            }
                            long j = columnIndex4 != -1 ? 0L : query2.getLong(columnIndex4);
                            long j2 = columnIndex5 != -1 ? 0L : query2.getLong(columnIndex5);
                            long j3 = columnIndex6 != -1 ? 0L : query2.getLong(columnIndex6);
                            z = false;
                            int i13 = columnIndex7 != -1 ? 0 : query2.getInt(columnIndex7);
                            if (columnIndex8 != -1) {
                                intToBackoffPolicy = null;
                            } else {
                                int i14 = query2.getInt(columnIndex8);
                                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                                intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i14);
                            }
                            long j4 = columnIndex9 != -1 ? 0L : query2.getLong(columnIndex9);
                            long j5 = columnIndex10 != -1 ? 0L : query2.getLong(columnIndex10);
                            int i15 = i10;
                            int i16 = i15 != -1 ? 0 : query2.getInt(i15);
                            i10 = i15;
                            int i17 = i11;
                            int i18 = i17 != -1 ? 0 : query2.getInt(i17);
                            i11 = i17;
                            int i19 = i8;
                            long j6 = i19 != -1 ? 0L : query2.getLong(i19);
                            i8 = i19;
                            int i20 = columnIndex14;
                            int i21 = i20 != -1 ? 0 : query2.getInt(i20);
                            columnIndex14 = i20;
                            i = columnIndex15;
                            if (i != -1) {
                                intToNetworkType = null;
                            } else {
                                int i22 = query2.getInt(i);
                                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                                intToNetworkType = WorkTypeConverters.intToNetworkType(i22);
                            }
                            columnIndex15 = i;
                            i2 = columnIndex16;
                            if (i2 != -1) {
                                z2 = false;
                            } else {
                                z2 = query2.getInt(i2) != 0;
                            }
                            columnIndex16 = i2;
                            i3 = columnIndex17;
                            if (i3 != -1) {
                                z3 = false;
                            } else {
                                z3 = query2.getInt(i3) != 0;
                            }
                            columnIndex17 = i3;
                            i4 = columnIndex18;
                            if (i4 != -1) {
                                z4 = false;
                            } else {
                                z4 = query2.getInt(i4) != 0;
                            }
                            columnIndex18 = i4;
                            i5 = columnIndex19;
                            if (i5 != -1 && query2.getInt(i5) != 0) {
                                z = true;
                            }
                            columnIndex19 = i5;
                            int i23 = columnIndex20;
                            boolean z5 = z;
                            long j7 = i23 != -1 ? 0L : query2.getLong(i23);
                            columnIndex20 = i23;
                            int i24 = columnIndex21;
                            long j8 = i24 != -1 ? query2.getLong(i24) : 0L;
                            columnIndex21 = i24;
                            i6 = columnIndex22;
                            long j9 = j8;
                            if (i6 != -1) {
                                byteArrayToSetOfTriggers = null;
                            } else {
                                byte[] blob = query2.isNull(i6) ? null : query2.getBlob(i6);
                                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                                byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob);
                            }
                            Constraints constraints = new Constraints(intToNetworkType, z2, z3, z4, z5, j7, j9, byteArrayToSetOfTriggers);
                            arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                            columnIndex22 = i6;
                        }
                        string = null;
                        if (columnIndex2 != -1) {
                        }
                        if (columnIndex3 != -1) {
                        }
                        if (columnIndex4 != -1) {
                        }
                        if (columnIndex5 != -1) {
                        }
                        if (columnIndex6 != -1) {
                        }
                        z = false;
                        if (columnIndex7 != -1) {
                        }
                        if (columnIndex8 != -1) {
                        }
                        if (columnIndex9 != -1) {
                        }
                        if (columnIndex10 != -1) {
                        }
                        int i152 = i10;
                        if (i152 != -1) {
                        }
                        i10 = i152;
                        int i172 = i11;
                        if (i172 != -1) {
                        }
                        i11 = i172;
                        int i192 = i8;
                        if (i192 != -1) {
                        }
                        i8 = i192;
                        int i202 = columnIndex14;
                        if (i202 != -1) {
                        }
                        columnIndex14 = i202;
                        i = columnIndex15;
                        if (i != -1) {
                        }
                        columnIndex15 = i;
                        i2 = columnIndex16;
                        if (i2 != -1) {
                        }
                        columnIndex16 = i2;
                        i3 = columnIndex17;
                        if (i3 != -1) {
                        }
                        columnIndex17 = i3;
                        i4 = columnIndex18;
                        if (i4 != -1) {
                        }
                        columnIndex18 = i4;
                        i5 = columnIndex19;
                        if (i5 != -1) {
                            z = true;
                        }
                        columnIndex19 = i5;
                        int i232 = columnIndex20;
                        boolean z52 = z;
                        if (i232 != -1) {
                        }
                        columnIndex20 = i232;
                        int i242 = columnIndex21;
                        if (i242 != -1) {
                        }
                        columnIndex21 = i242;
                        i6 = columnIndex22;
                        long j92 = j8;
                        if (i6 != -1) {
                        }
                        Constraints constraints2 = new Constraints(intToNetworkType, z2, z3, z4, z52, j7, j92, byteArrayToSetOfTriggers);
                        arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                        if (arrayList == null) {
                        }
                        arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                        if (arrayList2 == null) {
                        }
                        arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints2, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                        columnIndex22 = i6;
                    }
                    return arrayList3;
                } finally {
                    query2.close();
                }
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    public Flow<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosFlow(final SupportSQLiteQuery query) {
        return CoroutinesRoom.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.RawWorkInfoDao_Impl.2
            /* JADX WARN: Removed duplicated region for block: B:100:0x0214 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x01fd A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:110:0x01e7 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:111:0x01d7 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01c9 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:113:0x01b9 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:114:0x01a9 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:115:0x019b A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:116:0x0190 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0181 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0178 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:119:0x016d A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:120:0x0164 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:121:0x015b A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:122:0x0141 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0130 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0161  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x016a  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0175  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x018d  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01b2  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x01c2  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x01d0  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01f6  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0224  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x024d  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0269  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0292 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x02a5 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:85:0x026c A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:90:0x0262 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:91:0x0254 A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            /* JADX WARN: Removed duplicated region for block: B:95:0x022b A[Catch: all -> 0x02c6, TryCatch #0 {all -> 0x02c6, blocks: (B:3:0x0010, B:4:0x00bd, B:6:0x00c3, B:8:0x00d1, B:9:0x00de, B:11:0x00ea, B:17:0x00f7, B:18:0x0112, B:77:0x0281, B:79:0x0292, B:80:0x0297, B:82:0x02a5, B:83:0x02aa, B:85:0x026c, B:88:0x0279, B:89:0x0275, B:90:0x0262, B:91:0x0254, B:92:0x0242, B:95:0x022b, B:100:0x0214, B:105:0x01fd, B:110:0x01e7, B:111:0x01d7, B:112:0x01c9, B:113:0x01b9, B:114:0x01a9, B:115:0x019b, B:116:0x0190, B:117:0x0181, B:118:0x0178, B:119:0x016d, B:120:0x0164, B:121:0x015b, B:122:0x0141, B:125:0x014d, B:126:0x0149, B:127:0x0130, B:128:0x011e, B:131:0x0125), top: B:2:0x0010 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                String string;
                WorkInfo.State intToState;
                Data fromByteArray;
                boolean z;
                BackoffPolicy intToBackoffPolicy;
                int i;
                NetworkType intToNetworkType;
                int i2;
                boolean z2;
                int i3;
                boolean z3;
                int i4;
                boolean z4;
                int i5;
                int i6;
                Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers;
                ArrayList arrayList;
                ArrayList arrayList2;
                int i7;
                Cursor query2 = DBUtil.query(RawWorkInfoDao_Impl.this.__db, query, true, null);
                try {
                    int columnIndex = CursorUtil.getColumnIndex(query2, "id");
                    int columnIndex2 = CursorUtil.getColumnIndex(query2, "state");
                    int columnIndex3 = CursorUtil.getColumnIndex(query2, "output");
                    int columnIndex4 = CursorUtil.getColumnIndex(query2, "initial_delay");
                    int columnIndex5 = CursorUtil.getColumnIndex(query2, "interval_duration");
                    int columnIndex6 = CursorUtil.getColumnIndex(query2, "flex_duration");
                    int columnIndex7 = CursorUtil.getColumnIndex(query2, "run_attempt_count");
                    int columnIndex8 = CursorUtil.getColumnIndex(query2, "backoff_policy");
                    int columnIndex9 = CursorUtil.getColumnIndex(query2, "backoff_delay_duration");
                    int columnIndex10 = CursorUtil.getColumnIndex(query2, "last_enqueue_time");
                    int columnIndex11 = CursorUtil.getColumnIndex(query2, "period_count");
                    int columnIndex12 = CursorUtil.getColumnIndex(query2, "generation");
                    int columnIndex13 = CursorUtil.getColumnIndex(query2, "next_schedule_time_override");
                    int columnIndex14 = CursorUtil.getColumnIndex(query2, DownloadService.KEY_STOP_REASON);
                    int columnIndex15 = CursorUtil.getColumnIndex(query2, "required_network_type");
                    int columnIndex16 = CursorUtil.getColumnIndex(query2, "requires_charging");
                    int columnIndex17 = CursorUtil.getColumnIndex(query2, "requires_device_idle");
                    int columnIndex18 = CursorUtil.getColumnIndex(query2, "requires_battery_not_low");
                    int columnIndex19 = CursorUtil.getColumnIndex(query2, "requires_storage_not_low");
                    int columnIndex20 = CursorUtil.getColumnIndex(query2, "trigger_content_update_delay");
                    int columnIndex21 = CursorUtil.getColumnIndex(query2, "trigger_max_content_delay");
                    int columnIndex22 = CursorUtil.getColumnIndex(query2, "content_uri_triggers");
                    HashMap hashMap = new HashMap();
                    int i8 = columnIndex13;
                    HashMap hashMap2 = new HashMap();
                    while (query2.moveToNext()) {
                        int i9 = columnIndex12;
                        String string2 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap.get(string2)) == null) {
                            i7 = columnIndex11;
                            hashMap.put(string2, new ArrayList());
                        } else {
                            i7 = columnIndex11;
                        }
                        String string3 = query2.getString(columnIndex);
                        if (((ArrayList) hashMap2.get(string3)) == null) {
                            hashMap2.put(string3, new ArrayList());
                        }
                        columnIndex12 = i9;
                        columnIndex11 = i7;
                    }
                    int i10 = columnIndex11;
                    int i11 = columnIndex12;
                    query2.moveToPosition(-1);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(hashMap);
                    RawWorkInfoDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(hashMap2);
                    ArrayList arrayList3 = new ArrayList(query2.getCount());
                    while (query2.moveToNext()) {
                        if (columnIndex != -1 && !query2.isNull(columnIndex)) {
                            string = query2.getString(columnIndex);
                            if (columnIndex2 != -1) {
                                intToState = null;
                            } else {
                                int i12 = query2.getInt(columnIndex2);
                                WorkTypeConverters workTypeConverters = WorkTypeConverters.INSTANCE;
                                intToState = WorkTypeConverters.intToState(i12);
                            }
                            if (columnIndex3 != -1) {
                                fromByteArray = null;
                            } else {
                                fromByteArray = Data.fromByteArray(query2.isNull(columnIndex3) ? null : query2.getBlob(columnIndex3));
                            }
                            long j = columnIndex4 != -1 ? 0L : query2.getLong(columnIndex4);
                            long j2 = columnIndex5 != -1 ? 0L : query2.getLong(columnIndex5);
                            long j3 = columnIndex6 != -1 ? 0L : query2.getLong(columnIndex6);
                            z = false;
                            int i13 = columnIndex7 != -1 ? 0 : query2.getInt(columnIndex7);
                            if (columnIndex8 != -1) {
                                intToBackoffPolicy = null;
                            } else {
                                int i14 = query2.getInt(columnIndex8);
                                WorkTypeConverters workTypeConverters2 = WorkTypeConverters.INSTANCE;
                                intToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy(i14);
                            }
                            long j4 = columnIndex9 != -1 ? 0L : query2.getLong(columnIndex9);
                            long j5 = columnIndex10 != -1 ? 0L : query2.getLong(columnIndex10);
                            int i15 = i10;
                            int i16 = i15 != -1 ? 0 : query2.getInt(i15);
                            i10 = i15;
                            int i17 = i11;
                            int i18 = i17 != -1 ? 0 : query2.getInt(i17);
                            i11 = i17;
                            int i19 = i8;
                            long j6 = i19 != -1 ? 0L : query2.getLong(i19);
                            i8 = i19;
                            int i20 = columnIndex14;
                            int i21 = i20 != -1 ? 0 : query2.getInt(i20);
                            columnIndex14 = i20;
                            i = columnIndex15;
                            if (i != -1) {
                                intToNetworkType = null;
                            } else {
                                int i22 = query2.getInt(i);
                                WorkTypeConverters workTypeConverters3 = WorkTypeConverters.INSTANCE;
                                intToNetworkType = WorkTypeConverters.intToNetworkType(i22);
                            }
                            columnIndex15 = i;
                            i2 = columnIndex16;
                            if (i2 != -1) {
                                z2 = false;
                            } else {
                                z2 = query2.getInt(i2) != 0;
                            }
                            columnIndex16 = i2;
                            i3 = columnIndex17;
                            if (i3 != -1) {
                                z3 = false;
                            } else {
                                z3 = query2.getInt(i3) != 0;
                            }
                            columnIndex17 = i3;
                            i4 = columnIndex18;
                            if (i4 != -1) {
                                z4 = false;
                            } else {
                                z4 = query2.getInt(i4) != 0;
                            }
                            columnIndex18 = i4;
                            i5 = columnIndex19;
                            if (i5 != -1 && query2.getInt(i5) != 0) {
                                z = true;
                            }
                            columnIndex19 = i5;
                            int i23 = columnIndex20;
                            boolean z5 = z;
                            long j7 = i23 != -1 ? 0L : query2.getLong(i23);
                            columnIndex20 = i23;
                            int i24 = columnIndex21;
                            long j8 = i24 != -1 ? query2.getLong(i24) : 0L;
                            columnIndex21 = i24;
                            i6 = columnIndex22;
                            long j9 = j8;
                            if (i6 != -1) {
                                byteArrayToSetOfTriggers = null;
                            } else {
                                byte[] blob = query2.isNull(i6) ? null : query2.getBlob(i6);
                                WorkTypeConverters workTypeConverters4 = WorkTypeConverters.INSTANCE;
                                byteArrayToSetOfTriggers = WorkTypeConverters.byteArrayToSetOfTriggers(blob);
                            }
                            Constraints constraints = new Constraints(intToNetworkType, z2, z3, z4, z5, j7, j9, byteArrayToSetOfTriggers);
                            arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                            columnIndex22 = i6;
                        }
                        string = null;
                        if (columnIndex2 != -1) {
                        }
                        if (columnIndex3 != -1) {
                        }
                        if (columnIndex4 != -1) {
                        }
                        if (columnIndex5 != -1) {
                        }
                        if (columnIndex6 != -1) {
                        }
                        z = false;
                        if (columnIndex7 != -1) {
                        }
                        if (columnIndex8 != -1) {
                        }
                        if (columnIndex9 != -1) {
                        }
                        if (columnIndex10 != -1) {
                        }
                        int i152 = i10;
                        if (i152 != -1) {
                        }
                        i10 = i152;
                        int i172 = i11;
                        if (i172 != -1) {
                        }
                        i11 = i172;
                        int i192 = i8;
                        if (i192 != -1) {
                        }
                        i8 = i192;
                        int i202 = columnIndex14;
                        if (i202 != -1) {
                        }
                        columnIndex14 = i202;
                        i = columnIndex15;
                        if (i != -1) {
                        }
                        columnIndex15 = i;
                        i2 = columnIndex16;
                        if (i2 != -1) {
                        }
                        columnIndex16 = i2;
                        i3 = columnIndex17;
                        if (i3 != -1) {
                        }
                        columnIndex17 = i3;
                        i4 = columnIndex18;
                        if (i4 != -1) {
                        }
                        columnIndex18 = i4;
                        i5 = columnIndex19;
                        if (i5 != -1) {
                            z = true;
                        }
                        columnIndex19 = i5;
                        int i232 = columnIndex20;
                        boolean z52 = z;
                        if (i232 != -1) {
                        }
                        columnIndex20 = i232;
                        int i242 = columnIndex21;
                        if (i242 != -1) {
                        }
                        columnIndex21 = i242;
                        i6 = columnIndex22;
                        long j92 = j8;
                        if (i6 != -1) {
                        }
                        Constraints constraints2 = new Constraints(intToNetworkType, z2, z3, z4, z52, j7, j92, byteArrayToSetOfTriggers);
                        arrayList = (ArrayList) hashMap.get(query2.getString(columnIndex));
                        if (arrayList == null) {
                        }
                        arrayList2 = (ArrayList) hashMap2.get(query2.getString(columnIndex));
                        if (arrayList2 == null) {
                        }
                        arrayList3.add(new WorkSpec.WorkInfoPojo(string, intToState, fromByteArray, j, j2, j3, constraints2, i13, intToBackoffPolicy, j4, j5, i16, i18, j6, i21, arrayList, arrayList2));
                        columnIndex22 = i6;
                    }
                    return arrayList3;
                } finally {
                    query2.close();
                }
            }
        });
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(final HashMap<String, ArrayList<String>> _map) {
        int i;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<String>> hashMap = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : keySet) {
                    hashMap.put(str, _map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                hashMap = new HashMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(hashMap);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i2);
            } else {
                acquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<String> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.isNull(0) ? null : query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(final HashMap<String, ArrayList<Data>> _map) {
        int i;
        Set<String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.size() > 999) {
            HashMap<String, ArrayList<Data>> hashMap = new HashMap<>(999);
            loop0: while (true) {
                i = 0;
                for (String str : keySet) {
                    hashMap.put(str, _map.get(str));
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
                hashMap = new HashMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(hashMap);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i2 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                acquire.bindNull(i2);
            } else {
                acquire.bindString(i2, str2);
            }
            i2++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                ArrayList<Data> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(Data.fromByteArray(query.isNull(0) ? null : query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }
}
