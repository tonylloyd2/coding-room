# Generated by Django 4.0.2 on 2022-02-11 11:50

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('booking', '0005_booking_firstname_booking_lastname'),
    ]

    operations = [
        migrations.RenameField(
            model_name='booking',
            old_name='firstname',
            new_name='first_name',
        ),
        migrations.RenameField(
            model_name='booking',
            old_name='lastname',
            new_name='last_name',
        ),
    ]
