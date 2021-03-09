#include<bits/stdc++.h>

using namespace std;

class vehicle{
private:
    string model_number;
    string engine_type;
    float engine_power;
    float tire_size;

public:
    void set_model_number( string s );
    void set_engine_type( string s );
    void set_engine_power( float f );
    void set_tire_size( float f );

    string get_model_number();
    string get_engine_type();
    float get_engine_power();
    float get_tire_size();
};

void vehicle::set_model_number( string s ){
    model_number = s;
}

void vehicle::set_engine_type( string s ){
    engine_type = s;
}

void vehicle::set_engine_power( float f ){
    engine_power = f;
}

void vehicle::set_tire_size( float f ){
    tire_size = f;
}

string vehicle::get_model_number(){
    return model_number;
}

string vehicle::get_engine_type(){
    return engine_type;
}

float vehicle::get_engine_power(){
    return engine_power;
}

float vehicle::get_tire_size(){
    return tire_size;
}



int main(){

    return 0;
}
