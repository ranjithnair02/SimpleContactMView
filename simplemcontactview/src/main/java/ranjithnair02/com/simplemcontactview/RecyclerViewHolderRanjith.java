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

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

class RecyclerViewHolderRanjith extends RecyclerView.ViewHolder {
    protected Button contactbtn;
    protected TextView maintxt, subtxt, timetxt;

    public RecyclerViewHolderRanjith(View itemView, final Context context) {
        super(itemView);
        this.contactbtn = (Button) itemView.findViewById(R.id.ranj_img_contact);
        this.maintxt = (TextView) itemView.findViewById(R.id.ranj_txt_contact);
        this.subtxt = (TextView) itemView.findViewById(R.id.ranj_sub_txt_contact);
        this.timetxt = (TextView) itemView.findViewById(R.id.ranj_time_called);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ph_email = subtxt.getText().toString();
                if (!TextUtils.isEmpty(subtxt.getText().toString())) {
                    if (Patterns.EMAIL_ADDRESS.matcher(ph_email).matches()) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("plain/text");
                        context.startActivity(intent);
                    } else {
                        context.startActivity(Intent.createChooser(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + ph_email)), "Send Email"));
                    }
                }
            }
        });
    }
}
