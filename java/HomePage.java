package c.tests.winter2018;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * This class implements the home page of the application
 * The user clicks on ClockIn, ClockOut, Break, ReturnBreak buttons
 * according to the operation he wants. The appropriate calculations
 * are made in this class such as the length of the break, the time
 * of clock in and out etc. His actions are stored in the database
 * in the Attendance table.
 */

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HomePage extends Fragment {

    private TextView info;
    public String information="\nThe EMIRA routes began in 1969 when the founder, " +
            "Mr Michael, studied ceramics art in Famagusta. " +
            "In 1975 due to the Turkish invasion in Cyprus, " +
            "the artist emigrated to Athens where he continued his studies in ceramics art. " +
            "Following this he opened his own pottery workshop " +
            "there.\n\n In 1987 he returned to Cyprus and established Emira Pottery at 13 Mehmet Ali Str." +
            " near St. Lazarus church, as it is today.\n" +
            "The beauty of ceramics inspired him to expand his horizons " +
            "and open a showroom with his creations. \n\nOur workshop " +
            "is open to the public and visitors will have the opportunity to" +
            "watch the artists creating, but they will also " +
            "be challenged to try the magic of clay.\n\n" +
            "Workshop Working Hours: Monday to Friday: 08:00 – 16:30.\n" +
            "\n" +
            "But is open to have a look until 21:00 and Saturday 09:00 – 15:00.\n\n";


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.home_page, container , false);




        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        info = (TextView) getActivity().findViewById(R.id.info);
        info.setText(information);



        getActivity().setTitle("Home");

    }

}