# Generated by Django 4.0.2 on 2022-02-12 17:47

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('booking', '0007_remove_booking_id_booking_booking_id'),
    ]

    operations = [
        migrations.AddField(
            model_name='booking',
            name='status',
            field=models.CharField(default='active', max_length=50),
        ),
    ]
