package com.example.voteasy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerCandidateAdapter extends RecyclerView.Adapter<RecyclerCandidateAdapter.ViewHolder> {


    Context context ;
    ArrayList<CandidateModel> arrCandidates;
    RecyclerCandidateAdapter(Context context, ArrayList<CandidateModel> arrCandidates){
        this.context = context;
        this.arrCandidates = arrCandidates;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.candidate_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
         holder.imgCandidate.setImageResource(arrCandidates.get(position).img);
         holder.txtName.setText(arrCandidates.get(position).name);
         holder.txtParty.setText(arrCandidates.get(position).party);

         holder.llRow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 final Dialog dialog = new Dialog(context);
                 dialog.setContentView(R.layout.candidate_form);
                 final EditText candidateName = dialog.findViewById(R.id.candidate_name);
                 final EditText partyName = dialog.findViewById(R.id.partyname);
                 Button btnAction = dialog.findViewById(R.id.candidateActionbtn);
                 TextView title =dialog.findViewById(R.id.candidate_form_title);
                 title.setText("Update Candidate");
                 btnAction.setText("Update");
                 candidateName.setText((arrCandidates.get(position)).name);
                 partyName.setText((arrCandidates.get(position)).party);
                 btnAction.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {

                         String name = "",party = "";
                         if(!candidateName.getText().toString().equals("")){
                             name  = candidateName.getText().toString();
                         }
                         else{
                             Toast.makeText(context, "Please Enter Candidate Name", Toast.LENGTH_SHORT).show();
                         }
                         if(!candidateName.getText().toString().equals("")){
                             party = partyName.getText().toString();
                         }
                         else{
                             Toast.makeText(context, "Please Enter Party Name", Toast.LENGTH_SHORT).show();
                         }
                         arrCandidates.set(position,new CandidateModel( arrCandidates.get(position).img,name,party));
                         notifyItemChanged(position);
                         dialog.dismiss();
                     }
                 });
                 dialog.show();
             }

         });

         holder.llRow.setOnLongClickListener(new View.OnLongClickListener() {
             @Override
             public boolean onLongClick(View v) {
                 AlertDialog.Builder builder = new AlertDialog.Builder(context)
                         .setTitle("Delete Candidate").setMessage("Do you want to delete candidate")
                         .setIcon(R.drawable.ic_baseline_delete_24)
                         .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {
                                  arrCandidates.remove(position);
                                  notifyItemRemoved(position);
                             }
                         })
                         .setNegativeButton("No", new DialogInterface.OnClickListener() {
                             @Override
                             public void onClick(DialogInterface dialog, int which) {

                             }
                         });
                 builder.show();
                 return true;
             }
         });
    }

    @Override
    public int getItemCount() {
        return arrCandidates.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
         TextView txtName, txtParty;
         ImageView imgCandidate;
         LinearLayout llRow;
         public  ViewHolder(View itemView){
             super(itemView);
             txtName = itemView.findViewById(R.id.txtName);
             txtParty = itemView.findViewById(R.id.txtParty);
             imgCandidate = itemView.findViewById(R.id.imgCandidate);
             llRow = itemView.findViewById(R.id.llRow);
         }
    }
}
