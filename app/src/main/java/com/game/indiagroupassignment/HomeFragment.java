package com.game.indiagroupassignment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class HomeFragment extends Fragment {

    private ViewPager horoscopesViewPager,reportViewPager,astrologerViewPager;
    private String horoscope_response = "{\n" +
            "   \"httpStatus\":\"OK\",\n" +
            "   \"httpStatusCode\":200,\n" +
            "   \"success\":true,\n" +
            "   \"message\":\"fetched successfully\",\n" +
            "   \"apiName\":\"Get all daily horoscopes\",\n" +
            "   \"data\":[\n" +
            "      {\n" +
            "         \"name\":\"aries\",\n" +
            "         \"date\":\"Mar 21 - Apr 20\",\n" +
            "         \"img\":\"aries.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":34\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":19\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"aries-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"taurus\",\n" +
            "         \"date\":\"Apr 21 - May 20\",\n" +
            "         \"img\":\"taurus.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":35\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":20\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"taurus-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"gemini\",\n" +
            "         \"date\":\"May 21 - Jun 20\",\n" +
            "         \"img\":\"gemini.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":36\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":21\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"gemini-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"cancer\",\n" +
            "         \"date\":\"Jun 21 - Jul 20\",\n" +
            "         \"img\":\"cancer.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":37\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":22\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"cancer-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"leo\",\n" +
            "         \"date\":\"Jul 21 - Aug 20\",\n" +
            "         \"img\":\"leo.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":38\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":23\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"leo-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"virgo\",\n" +
            "         \"date\":\"Aug 21 - Sep 20\",\n" +
            "         \"img\":\"virgo.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":39\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":24\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"virgo-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"libra\",\n" +
            "         \"date\":\"Sep 21 - Oct 20\",\n" +
            "         \"img\":\"libra.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":40\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":25\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"libra-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"scorpio\",\n" +
            "         \"date\":\"Oct 21 - Nov 20\",\n" +
            "         \"img\":\"scorpio.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":41\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":26\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"scorpio-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"sagittarius\",\n" +
            "         \"date\":\"Nov 21 - Dec 20\",\n" +
            "         \"img\":\"sagittarius.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":42\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":27\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"sagittarius-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"capricorn\",\n" +
            "         \"date\":\"Dec 21 - Jan 20\",\n" +
            "         \"img\":\"capricorn.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":43\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":28\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"capricon-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"aquarius\",\n" +
            "         \"date\":\"Jan 21 - Feb 20\",\n" +
            "         \"img\":\"aquarius.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":44\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":29\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"aquarius-daily-horoscope\"\n" +
            "      },\n" +
            "      {\n" +
            "         \"name\":\"pisces\",\n" +
            "         \"date\":\"Feb 21 - Mar 20\",\n" +
            "         \"img\":\"pisces.webp\",\n" +
            "         \"images\":{\n" +
            "            \"small\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":45\n" +
            "            },\n" +
            "            \"large\":{\n" +
            "               \"imageUrl\":null,\n" +
            "               \"id\":null\n" +
            "            },\n" +
            "            \"medium\":{\n" +
            "               \"imageUrl\":\"\",\n" +
            "               \"id\":30\n" +
            "            }\n" +
            "         },\n" +
            "         \"urlSlug\":\"pisces-daily-horoscope\"\n" +
            "      }\n" +
            "   ]\n" +
            "}";

    private String reportReponse = "{\n" +
            "   \"httpStatus\":\"OK\",\n" +
            "   \"httpStatusCode\":200,\n" +
            "   \"success\":true,\n" +
            "   \"message\":\"Services fetched successfully.\",\n" +
            "   \"apiName\":\"Get all services.\",\n" +
            "   \"data\":{\n" +
            "      \"services\":[\n" +
            "         {\n" +
            "            \"name\":\"Horoscope\",\n" +
            "            \"productCode\":\"HS\",\n" +
            "            \"imageUrl\":\"horoscope.webp\",\n" +
            "            \"description\":\"In-depth Horoscope will give you detailed life prediction reports and remedieson everything going to happen in 25 years of your life.\",\n" +
            "            \"availableLanguages\":[\n" +
            "               \n" +
            "            ],\n" +
            "            \"indepthPoints\":[\n" +
            "               \n" +
            "            ],\n" +
            "            \"price\":\"251\",\n" +
            "            \"offerPrice\":\"51\"\n" +
            "         }\n" +
            "      ]\n" +
            "   }\n" +
            "}";

    private String astro_reponse = "{\n" +
            "   \"id\":31,\n" +
            "   \"urlSlug\":\"anshika-saxena\",\n" +
            "   \"namePrefix\":null,\n" +
            "   \"firstName\":\"anshika\",\n" +
            "   \"lastName\":\"saxena\",\n" +
            "   \"aboutMe\":\"Hello I am here\",\n" +
            "   \"profliePicUrl\":null,\n" +
            "   \"experience\":1.0,\n" +
            "   \"languages\":[\n" +
            "      \n" +
            "   ],\n" +
            "   \"minimumCallDuration\":5,\n" +
            "   \"minimumCallDurationCharges\":50.0,\n" +
            "   \"additionalPerMinuteCharges\":10.0,\n" +
            "   \"isAvailable\":true,\n" +
            "   \"rating\":null,\n" +
            "   \"skills\":[\n" +
            "      \n" +
            "   ],\n" +
            "   \"isOnCall\":false,\n" +
            "   \"images\":{\n" +
            "      \"large\":{\n" +
            "         \"imageUrl\":\"\",\n" +
            "         \"id\":92\n" +
            "      },\n" +
            "      \"medium\":{\n" +
            "         \"imageUrl\":\"https://tak-astrotak-av-dev.s3.ap-south-1.amazonaws.com/astro-images/agents/1.png\",\n" +
            "         \"id\":123\n" +
            "      }\n" +
            "   },\n" +
            "   \"availability\":{\n" +
            "      \"days\":[\n" +
            "         \"MON\",\n" +
            "         \"WED\",\n" +
            "         \"THU\",\n" +
            "         \"FRI\"\n" +
            "      ],\n" +
            "      \"slot\":{\n" +
            "         \"toFormat\":\"PM\",\n" +
            "         \"fromFormat\":\"AM\",\n" +
            "         \"from\":\"10\",\n" +
            "         \"to\":\"7\"\n" +
            "      }\n" +
            "   }\n" +
            "}";
    String question_category_response = "{\n" +
            "   \"httpStatus\":\"OK\",\n" +
            "   \"httpStatusCode\":200,\n" +
            "   \"success\":true,\n" +
            "   \"message\":\"Question categories fetched successfully.\",\n" +
            "   \"apiName\":\"Get all categories.\",\n" +
            "   \"data\":[\n" +
            "      {\n" +
            "         \"id\":4,\n" +
            "         \"name\":\"Love\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"When is the right for me to introduce my boyfriend / girlfriend?\",\n" +
            "            \"Doubtful about taking my relationship to next level?\",\n" +
            "            \"How will I meet my potential life partner?\",\n" +
            "            \"Is my wife/Husband faithful?\",\n" +
            "            \"Will I ever meet my true love?\",\n" +
            "            \"When will I get in relationship?\"\n" +
            "         ]\n" +
            "      },\n" +
            "      {\n" +
            "         \"id\":6,\n" +
            "         \"name\":\"Business\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"Am I a good businessman according to by chart?\",\n" +
            "            \"I want to start my own business. Will I be successful?\",\n" +
            "            \"Which is the best place to invest my money?\",\n" +
            "            \"Should I partner with my friend in his new business?\",\n" +
            "            \"I am taking a new project. Will I make money?\",\n" +
            "            \"Should I start a new business with my brother?\",\n" +
            "            \"Which sector is a good sector for business?\",\n" +
            "            \"I started my business but failed. Should I try again?\",\n" +
            "            \"My business is not running well. What should I do?\",\n" +
            "            \"What do my employees think of me?\",\n" +
            "            \"My partners are not agreeing to new deal. Should I go independently?\",\n" +
            "            \"How will this year be for my business?\",\n" +
            "            \"Will I get in trouble with government for my business?\",\n" +
            "            \"New competitors have entered by business. How will I perform against them?\"\n" +
            "         ]\n" +
            "      },\n" +
            "      {\n" +
            "         \"id\":7,\n" +
            "         \"name\":\"Education\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"What is the best field for me to study?\",\n" +
            "            \"Will I get admission in my choice of college?\",\n" +
            "            \"Will I get selected in medical college this year?\",\n" +
            "            \"Is doing engineering good for my career?\",\n" +
            "            \"How will I perform in 10 boards this year?\",\n" +
            "            \"Will I pass my 12 boards this year?\",\n" +
            "            \"Should I opt for science or commerce? What is best for me?\",\n" +
            "            \"What do my classmates think of me?\",\n" +
            "            \"What does my school friends thing of me?\",\n" +
            "            \"I failed this year, what went wrong?\",\n" +
            "            \"Will I pass this year? I am nervous\",\n" +
            "            \"I got selected in 2 colleges. Which is the best college for me? \",\n" +
            "            \"I graduated last year but unable to find a job? Please advice.\",\n" +
            "            \"Will I be able to go abroad for higher education?\"\n" +
            "         ]\n" +
            "      },\n" +
            "      {\n" +
            "         \"id\":12,\n" +
            "         \"name\":\"Work\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"When will I get a job?\",\n" +
            "            \"Which field is good for me?\",\n" +
            "            \"I have a job interview tomorrow. Will I get selected?\",\n" +
            "            \"What do my work colleagues think of me?\",\n" +
            "            \"How will I perform this year in my job?\",\n" +
            "            \"I feel my boss is not happy with me. What should I do?\",\n" +
            "            \"Should I move to a new city for a job offer? Will it help my career?\",\n" +
            "            \"I am stuck in sales job and not happy. What is your advice on my current job?\",\n" +
            "            \"What are the best colours for me to wear in job interview?\",\n" +
            "            \"When is the good time to search for a new job?\",\n" +
            "            \"I think my colleagues don’t like me. What should I do?\",\n" +
            "            \"I want to work abroad. Will I get a job outside?\"\n" +
            "         ]\n" +
            "      },\n" +
            "      {\n" +
            "         \"id\":13,\n" +
            "         \"name\":\"Self\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"Which is the right path for me ?\",\n" +
            "            \"Where and what is my potential?\",\n" +
            "            \"Do people around me like me?\",\n" +
            "            \"Which gemstone is suitable for me?\",\n" +
            "            \"Does my future hold success?\",\n" +
            "            \"What do stars say about my life?\"\n" +
            "         ]\n" +
            "      },\n" +
            "      {\n" +
            "         \"id\":14,\n" +
            "         \"name\":\"Life\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"Are there any surprises for me this week?\",\n" +
            "            \"What do my friends and family think about me?\",\n" +
            "            \"Feeling nervous about my test this week? How will it go?\",\n" +
            "            \"How will my day go today?\",\n" +
            "            \"What is the best time to move into my new house?\",\n" +
            "            \"What should I do to make balance my life?\",\n" +
            "            \"Is it a favourable time to buy a new car?\",\n" +
            "            \"Is it a right time to buy a new house?\",\n" +
            "            \"What is the right time to sell property?\",\n" +
            "            \"I don’t feel positive these days? Whats wrong?\",\n" +
            "            \"Lot of negativity around my life? What should I do?\",\n" +
            "            \"What is the right time to join new company?\",\n" +
            "            \"When is the right time to start my own business?\"\n" +
            "         ]\n" +
            "      },\n" +
            "      {\n" +
            "         \"id\":15,\n" +
            "         \"name\":\"Money\",\n" +
            "         \"description\":\"\",\n" +
            "         \"price\":99.0,\n" +
            "         \"suggestions\":[\n" +
            "            \"Will I become financially secure?\",\n" +
            "            \"Will I become rich one day?\",\n" +
            "            \"When will I get financially independent?\",\n" +
            "            \"Will my loan for new house get approved?\",\n" +
            "            \"Will my loan to start a new business get approved?\",\n" +
            "            \"What is the best time to apply for a loan?\",\n" +
            "            \"I am never able to save money. What should I do?\",\n" +
            "            \"How will the money flow in my life?\",\n" +
            "            \"When is the best time to take a car loan?\",\n" +
            "            \"I always think about making money. Is it good or bad?\",\n" +
            "            \"Which job can I earn the most?\",\n" +
            "            \"Should I change my job to make more money?\"\n" +
            "         ]\n" +
            "      }\n" +
            "   ]\n" +
            "}";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        horoscopesViewPager = view.findViewById(R.id.horoscopes_view_pager);
        reportViewPager = view.findViewById(R.id.reports_view_pager);
        astrologerViewPager = view.findViewById(R.id.astrologer_view_pager);
        JSONArray horoscopeArray = null;
        try {
            JSONObject data1 = new JSONObject(horoscope_response);
            horoscopeArray = data1.getJSONArray("data");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        horoscopesViewPager.setAdapter(new horoscopeAdapter(getChildFragmentManager(), horoscopeArray));
        horoscopesViewPager.setSaveEnabled(false);
        horoscopesViewPager.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        JSONObject astrologerObject = null;
        try {
            astrologerObject = new JSONObject(astro_reponse);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        astrologerViewPager.setAdapter(new astrologerAdapter(getChildFragmentManager(), astrologerObject));
        astrologerViewPager.setSaveEnabled(false);
        astrologerViewPager.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        JSONArray reportArray = null;
        try {
            JSONObject data1 = new JSONObject(reportReponse);
            JSONObject reportObject = data1.getJSONObject("data");
            reportArray = reportObject.getJSONArray("services");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        reportViewPager.setAdapter(new reportAdapter(getChildFragmentManager(), reportArray));
        reportViewPager.setSaveEnabled(false);
        reportViewPager.measure(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        return view;
    }

    private class horoscopeAdapter extends FragmentStatePagerAdapter {
        private JSONArray horoscopeJsonArray;
        horoscopeAdapter(@NonNull FragmentManager fm, JSONArray jsonArray) {
            super(fm);
            horoscopeJsonArray = jsonArray;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new HoroscopeFragment();
            try {
                JSONObject jsonObject = horoscopeJsonArray.optJSONObject(position);
                if(jsonObject != null){
                    Bundle bundle = new Bundle();
                    bundle.putString("title", jsonObject.optString("name"));
                    bundle.putString("date", jsonObject.optString("date"));
                    bundle.putString("img", jsonObject.optString("img"));
                    fragment.setArguments(bundle);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return horoscopeJsonArray.length();
        }

        @Override
        public float getPageWidth(int position) {
            return(0.455f);
        }
    }

    private class reportAdapter extends FragmentStatePagerAdapter {
        private JSONArray reportJsonArray;
        reportAdapter(@NonNull FragmentManager fm, JSONArray jsonArray) {
            super(fm);
            reportJsonArray = jsonArray;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new ReportFragment();
            try {
                JSONObject jsonObject = reportJsonArray.optJSONObject(position);
                if(jsonObject != null){
                    Bundle bundle = new Bundle();
                    bundle.putString("imageUrl", jsonObject.optString("imageUrl"));
                    fragment.setArguments(bundle);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return reportJsonArray.length();
        }

        @Override
        public float getPageWidth(int position) {
            return(0.455f);
        }
    }

    private class astrologerAdapter extends FragmentStatePagerAdapter {
        private JSONObject astroJsonObject;
        astrologerAdapter(@NonNull FragmentManager fm, JSONObject jsonArray) {
            super(fm);
            astroJsonObject = jsonArray;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            Fragment fragment = new AstroFragment();
            try {
                if(astroJsonObject != null){
                    Bundle bundle = new Bundle();
                    bundle.putString("firstName", astroJsonObject.optString("firstName"));
                    bundle.putString("lastName", astroJsonObject.optString("lastName"));
                    bundle.putString("rating", astroJsonObject.optString("rating"));
                    bundle.putString("perMinuteCharges", astroJsonObject.optString("additionalPerMinuteCharges"));
                    bundle.putString("imageUrl", astroJsonObject.optString("profliePicUrl"));
                    bundle.putString("aboutme", astroJsonObject.optString("aboutMe"));
                    fragment.setArguments(bundle);
                }
            } catch (Exception e){
                e.printStackTrace();
            }
            return fragment;
        }

        @Override
        public int getCount() {
            return astroJsonObject.length();
        }

        @Override
        public float getPageWidth(int position) {
            return(0.455f);
        }
    }


}