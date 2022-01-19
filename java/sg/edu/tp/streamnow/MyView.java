package sg.edu.tp.streamnow;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyView extends RecyclerView.ViewHolder {

    public TextView titleTxt;
    public TextView titleArtist;
    public ImageView image;
    public ImageButton removeBtn;

    public MyView(@NonNull View itemView) {
        super(itemView);

        titleTxt = itemView.findViewById(R.id.titleTxt);
        titleArtist = itemView.findViewById(R.id.titleArtist);
        image = itemView.findViewById(R.id.imageAlbum);
        removeBtn = itemView.findViewById(R.id.threedots);
    }
}
