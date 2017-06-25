package com.benny.openlauncher.core.interfaces;

import android.content.Context;
import android.view.DragEvent;

/**
 * Created by Michael on 25.06.2017.
 */

public interface IDialogHandler {

    void showPickAction(Context context, IOnAddAppDrawerItem resultHandler);
    void showEditDialog(Context context, IItem item, IOnEditDialog resultHandler);
    void showDeletePackageDialog(Context context, DragEvent dragEvent);

    interface IOnAddAppDrawerItem
    {
        void onAdd();
    }

    interface IOnEditDialog
    {
        void onRename(String name);
    }
}
