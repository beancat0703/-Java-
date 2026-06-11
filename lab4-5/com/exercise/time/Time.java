package com.exercise.time;

public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time()
    {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = isHourLegal(hour);
        this.minute = isMinSecLegal(minute);
        this.second = isMinSecLegal(second);
    }

    private int isHourLegal(int hour)
    {
        if (hour >=0 && hour <= 23)
        {
            return hour;
        }
        else
        {
            return 0;
        }
    }

    private int isMinSecLegal(int MinSec)
    {
        if (MinSec >=0 && MinSec <= 59)
        {
            return MinSec;
        }
        else
        {
            return 0;
        }
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = isHourLegal(hour);
    }

    public int getMin()
    {
        return minute;
    }

    public void setMin(int minute)
    {
        this.minute = isMinSecLegal(minute);
    }

    public int getSec()
    {
        return second;
    }

    public void setSec(int second)
    {
        this.second = isMinSecLegal(second);
    }

    public void addSeconds(int second)
    {
        if (second >= 0)
        {
            this.second += second;
            while (this.second >= 60)
            {
                this.second -= 60;
                this.minute ++;
            }
            while (this.minute >= 60)
            {
                this.minute -= 60;
                this.hour ++;
            }
            while (this.hour >= 24)
            {
                this.hour -= 24;
            }
        }
    }

    public boolean isEarlier(Time other)
    {
        if (this.hour < other.hour)
        {
            return true;
        }
        else if (this.hour > other.hour)
        {
            return false;
        }
        if (this.minute < other.minute)
        {
            return true;
        }
        else if (this.minute > other.minute)
        {
            return false;
        }
        if (this.second < other.second)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toStandardString()
    {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
