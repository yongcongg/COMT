package sg.edu.tp.streamnow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SongAdaptor extends RecyclerView.Adapter<MyView> {
    public SongAdaptor(List<Song> songs) {
        this.songs = songs;
    }

    List<Song> songs;
    Context context;
    @NonNull
    @Override
    public MyView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View songView = inflater.inflate(R.layout.item_song, parent, false);
        MyView viewHolder = new MyView(songView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyView holder, @SuppressLint("RecyclerView") final int position) {
        Song song = songs.get(position);
        TextView artist = holder.titleArtist;
        artist.setText(song.getArtiste());
        TextView title = holder.titleTxt;
        title.setText(song.getTitle());
        int imageId = AppUtil.getImageIdFromDrawable(context, song.getDrawable());
        holder.image.setImageResource(imageId);
        holder.removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopSongs.favList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}
