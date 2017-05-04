package com.gdcp.note.com.gdcp.note.date;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;


import java.util.ArrayList;

/**
 * Created by yls on 2017/5/4.
 */

public class NoteDBUtil {
    /*

    * */
    public  static boolean addNote(Context context, String title){

        ContentValues values = new ContentValues();
        values.put(TableNote.COL_ID, 1);
        values.put(TableNote.COL_TITLE, title);
        context.getContentResolver().insert(NoteContentProvider.NOTE_URI, values );
    }

    public  static ArrayList<Note> getNoteList(Context context){
        String[] projection = {TableNote.COL_ID, TableNote.COL_TITLE, TableNote.COL_CONTENT};
        Cursor c = context.getContentResolver().query(NoteContentProvider.NOTE_URI, projection, null, null, null, null);
        for(c.moveToFirst(); !c.isAfterLast(); c.moveToNext()){




        }

        c.close();
    }

}
