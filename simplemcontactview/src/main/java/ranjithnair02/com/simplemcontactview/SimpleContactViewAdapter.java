package ranjithnair02.com.simplemcontactview;
/*
 * Copyright 2015 Ranjith
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.*
 */

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class SimpleContactViewAdapter extends RecyclerView.Adapter<RecyclerViewHolderRanjith> {
    private List<ContactData> contact;
    private ContactData contactData;
    private int sdk = android.os.Build.VERSION.SDK_INT;
    private Context context;

    public SimpleContactViewAdapter(List<ContactData> list, Context context) {
        this.contact = list;
        this.context = context;
    }

    @Override
    public RecyclerViewHolderRanjith onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ranjlistrow, null);
        return new RecyclerViewHolderRanjith(v, context);
    }

    @SuppressLint("InlinedApi")
    @Override
    public void onBindViewHolder(RecyclerViewHolderRanjith holder, int position) {
        contactData = contact.get(position);
        holder.contactbtn.setText(contactData.getContactname().substring(0, 1).toUpperCase());
        holder.maintxt.setText(capitalizeString(contactData.getContactname()));
        holder.timetxt.setText(contactData.getTimecall());
        holder.subtxt.setText(contactData.getContactNo());

        ShapeDrawable drawable = new ShapeDrawable(new OvalShape());
        drawable.getPaint().setColor(Color.parseColor(RandomColorGen.init()));

        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            holder.contactbtn.setBackgroundDrawable(drawable);
        } else {
            holder.contactbtn.setBackground(drawable);
        }
    }

    @Override
    public int getItemCount() {
        return contact.size();
    }


    public static String capitalizeString(String string) {
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i])) {
                found = false;
            }
        }
        return String.valueOf(chars);
    }


}
